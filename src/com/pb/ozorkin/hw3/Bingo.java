package com.pb.ozorkin.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100");
        System.out.println("Для выхода введите 1111");
        Random random = new Random();
        int x = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;

        while (true) {
            attempt++;
            int y = scanner.nextInt();
            if (y == 1111) {
                break;
            }
            if (y > 100 || y < 0) {
                System.out.println("Введите число в диапазоне от 0 до 100");
            } else if (y > x) {
                    System.out.println("Загаданое число меньше введеного");
                } else if (y < x) {
                    System.out.println("Загаданое число больше введеного");
                } else if (y != x) {
                    continue;
                } else if (y == x) {
                    System.out.println("Bingo " + "Вы угадали с " + attempt + "-й " + " попытки");
                    break;
                }

            }
            System.out.println("До скорой встречи!");
        }


    }




