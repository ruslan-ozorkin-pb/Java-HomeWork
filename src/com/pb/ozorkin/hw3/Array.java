package com.pb.ozorkin.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Введите число для массива:");
        int x = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int y : array) { if (y>0)
            x = x + y;
        }
        System.out.println("сумма всех положительных элементов массива: " + x);

        boolean isSorted = false;
        int z;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
