package com.pb.ozorkin.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner tabl = new Scanner(System.in);
        int x ;
        System.out.println("znachenie : ");
        x = tabl.nextInt();
               if ( x > 100) {System.out.println("Введите значение в диапазоне 0-100");}
           else     if ( x > 50) {System.out.println("[51-100]");}
           else     if ( x > 36) {System.out.println("[36-50]");}
           else    if ( x > 14) {System.out.println("[15-35]");}
           else     if ( x >= 0  ) {System.out.println("[0-14]");}
           else {System.out.println("Введите значение в диапазоне 0-100");}





    }
}
