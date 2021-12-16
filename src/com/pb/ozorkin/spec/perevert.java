package com.pb.ozorkin.spec;

import java.util.Scanner;

public class perevert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// int n = -123;
        int n = scanner.nextInt();
        System.out.println(n);

        int n1 = 0;
        while (n != 0) {
            n1 = n1 * 10 + n % 10;
            n /= 10;
        }
        System.out.println(n1);
    }
}