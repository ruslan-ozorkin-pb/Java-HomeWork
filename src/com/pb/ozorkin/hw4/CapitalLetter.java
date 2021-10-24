package com.pb.ozorkin.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] array = str.toCharArray();

        array[0] = Character.toUpperCase(array[0]);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == ' ') {
                array[i + 1] = Character.toUpperCase(array[i + 1]);
            }
        }
        str = new String(array);
        System.out.println(str);
    }
}