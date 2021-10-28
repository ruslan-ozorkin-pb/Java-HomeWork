package com.pb.ozorkin.hw4;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    static char[] meth(String A) {
                return A.toCharArray(); // методом раскладываем строку на массив
            }
            static String meth2 (String B) { return B.replaceAll("[^\\p{L}\\p{N}]+", "");} // удаляем пробелы и симв

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase(); // ввод 1 строки
        String str2 = scanner.nextLine().toLowerCase(); // ввод 2 строки
        char[] array = meth(str1); // раскладываем строку на массив символов
        char[] array2 = meth(str2); // раскладываем строку на массив символов
            Arrays.sort(array); // сортируем буквы
            Arrays.sort(array2);
            String sort = new String (array);
            String sort2 = new String (array2);
        System.out.println(meth2(sort));
        System.out.println(meth2(sort2));
                if (meth2(sort).equals(meth2(sort2))) {
            System.out.println("anagram");} else {
        System.out.println("not anagram"); }



    }

}