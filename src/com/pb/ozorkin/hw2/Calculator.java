package com.pb.ozorkin.hw2;


import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        int x;
        int y;
        String sign = "+"; // + - * /

        System.out.println("znachenie 1: ");
        x = calc.nextInt () ;

        System.out.println("znachenie 2:  ");
        y = calc.nextInt ();

        System.out.println("operator: ");
        sign = calc.next () ;

        System.out.println("x = " + x + "y = " + y + " sign = " + sign) ;


        switch(sign) {
            case "+":
                System.out.println("x + y = " + (x + y));
                break;
            case "-":
                System.out.println("x - y = " + (x - y));
                break;
            case "*":
                System.out.println("x * y = " + (x * y));
                break;
            case "/" :
                if (y != 0)
                {System.out.println("x / y = " + (x / y));}  else System.out.println( "не дели на ноль");;
                break;



        }

    }
    }







