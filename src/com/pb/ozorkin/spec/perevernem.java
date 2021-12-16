package com.pb.ozorkin.spec;

import java.io.Console;
import java.util.Scanner;

public class perevernem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = scanner.nextInt();
        System.out.println("x = " + x);

        System.out.println("Введите число y: ");
        int y = scanner.nextInt();
        System.out.println("y = " + y);
        System.out.println("Вывод: ");
        System.out.println("x= " + y);
        System.out.println("y= " + x);

    }
}
