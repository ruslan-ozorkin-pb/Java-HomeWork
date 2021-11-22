package com.pb.ozorkin.hw9;

import com.pb.ozorkin.hw3.Array;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws IOException {
       createNumbersFile();
       createOddNumbersFile();


    }

    public static void createNumbersFile() throws IOException {
        Random random = new Random();
        FileWriter fw = new FileWriter("numbers.txt");
        BufferedWriter writer = new BufferedWriter(fw);
        Path path = Paths.get("numbers.txt");


        try (FileWriter writer1 = new FileWriter("numbers.txt")) {
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(101);
//                    array[i][j] = ((int) (Math.random() * 100) + 1);
                    System.out.print(array[i][j] + " ");
                    writer1.write(array[i][j] + " ");

                }
                writer1.write("\n");
//                writer1.write(array [i][j] + " " + "\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------");
    }


        public static void createOddNumbersFile () throws IOException {
            Path path = Paths.get("numbers.txt");
            System.out.println("Читаем сделаный файл \"" + path.toAbsolutePath() + "\":");
            try (BufferedReader reader = Files.newBufferedReader(path)) {
                System.out.println( " ---------------------------------------- ");
                String line;
                while((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("----------------------------------");

            } catch (Exception ex) {
                System.out.println("Error with file read: " + ex);
            }
            System.out.println("Чтение файла завершено");
            System.out.println("----------------------------------");


            try (Scanner in = new Scanner(new File("numbers.txt"));
                 PrintWriter out = new PrintWriter(new FileWriter("odd-numbers.txt"));) {
                System.out.println("Вывод, с учетом замены целых четных чисел на 0 :");
                System.out.println("----------------------------------");
                while (in.hasNextLine()) {
                    Scanner line = new Scanner(in.nextLine()); // Одна строка файла
                    while (line.hasNextInt()) {             // Разберем ее на числа
                        int numb = line.nextInt();          // Очередное число
                        if (numb % 2 == 0) {                // Если чётное
                            System.out.format("%d -> 0, ", numb); // Чтоб было видно, что делается
                            numb = 0;                       // Заменим его нулём
                        } else
                            System.out.print(numb + ", ");  // Чтоб было видно, что делается
                        out.print(numb + " ");
                    }
                    line.close();                   // Не забывать, чтобы не было утечек
                    out.println();                  // Строка закончена -- перенос строки в вых. файл
                    System.out.println();           // и на экране
                }
            } catch (IOException x) { System.out.println("IO error: " + x); }
        }

            }






