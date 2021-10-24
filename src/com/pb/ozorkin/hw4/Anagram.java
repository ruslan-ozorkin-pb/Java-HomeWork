package com.pb.ozorkin.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine(); // ввод 1 строки
        String str2 = scanner.nextLine(); // ввод 2 строки
        char[] array = str1.toCharArray(); // раскладываем строку на массив символов
        for (int i = 0; i < array.length; i++) { // задаем условие вывода массива 1
            System.out.println(array[i]);
        }
        char[] array2 = str2.toCharArray(); // раскладываем строку на массив символов
        for (int i = 0; i < array.length; i++) { // задаем условие вывода массива 2
            System.out.println(array2[i]);
/// Первая часть правильная, над второю подумаем)
        }
//        System.out.println(str1.equalsIgnoreCase(str2)); // вот тут сравнение не идет :(
    }
        public boolean isEqual ( char[] array, char[] array2){
            if (Arrays.equals(array, array2)) {
                return true;
            }
            return false;
        }







}
