package com.pb.ozorkin.spec;

import java.util.Scanner;


public class koren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       double x1 = Math.sqrt(x);
       int z1= (int) x1;
        System.out.println("Корень квадратного числа:" + x + " = " +  z1);
    }
}
