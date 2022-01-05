package com.pb.ozorkin.hw14;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

class ClientConnection {

    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;
    private BufferedReader inputUser;
    private final String addr;
    private final int port;
    private String nickname;
    private String dtime;
    private SimpleDateFormat dt1;

    public ClientConnection(String addr, int port) {
        this.addr = addr;
        this.port = port;

        try {
            this.socket = new Socket(addr, port);
        } catch (IOException e) {
            System.err.println("Соединение прервано");
        }

        try {
            inputUser = new BufferedReader(new InputStreamReader(System.in));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.pressNickname();
            new ReadMsg().start();
            new WriteMsg().start();
        } catch (IOException e) {
            ClientConnection.this.downService();
        }
    }

    private void pressNickname() {
        System.out.print("Введите ваш ник: ");
        try {
            nickname = inputUser.readLine();
            out.write("Добро пожаловать в чат: " + nickname + "\n");
            out.flush();
        } catch (IOException ignored) {

        }
    }

    private void downService() {
        try {
            if (!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
            }
        } catch (IOException ignored) {}
    }

    private class ReadMsg extends Thread {
        @Override
        public void run() {

            String str;
            try {
                while (true) {
                    str = in.readLine();
                    if (str.equalsIgnoreCase("exit")) {
                        ClientConnection.this.downService();
                        break;
                    }
                    System.out.println(str);
                }
            } catch (IOException e) {
                ClientConnection.this.downService();
            }
        }
    }

    public class WriteMsg extends Thread {
        @Override
        public void run() {
            while (true) {
                String userWord;
                try {
                    dt1 = new SimpleDateFormat("yyyy-MM-dd; HH:mm:ss");
                    dtime = dt1.format(new Date());
                    userWord = inputUser.readLine();
                    if (userWord.equalsIgnoreCase("exit")) {
                        out.write("exit" + "\n");
                        ClientConnection.this.downService();
                        break;
                    } else {
                        out.write("(" + dtime + ") " + nickname + ": " + userWord +  "\n");
                    }
                    out.flush();
                } catch (IOException e) {
                    ClientConnection.this.downService();

                }

            }
        }
    }
}


public class Client extends JFrame {

    public static String ipAddr = "localhost";
    public static int port = 8080;
    private static int WIDTH = 600;
    private static int HEIGHT = 400;



    public static void main(String[] args) {
        new ClientConnection(ipAddr, port);


    }

}