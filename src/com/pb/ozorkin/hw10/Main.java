package com.pb.ozorkin.hw10;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NumBox<Integer> objInt = new NumBox<Integer>(6);

        try {
            objInt.add(0, 5);
            objInt.add(1, 7);
            objInt.add(2, 3);
            objInt.add(3, 12);
            objInt.add(4, 6);
            objInt.add(5, 9);
//            objInt.add(6, 14);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Массив Integer переполен. Длинна массива: " + objInt.getSize() + " элементов]");
            e.printStackTrace();
        }

        System.out.println("Число по индексу 2: " + objInt.get(2));
        System.out.println("Количество элементов: " + objInt.length());
        System.out.println("Среднее арифметическое среди элементов: " + objInt.average());
        System.out.println("Сумма всех элементов массива: " + objInt.sum());
        System.out.println("Максимальный элемент массива: " + objInt.max());
        System.out.println();


        NumBox<Double> objDouble = new NumBox<Double>(5);

        try {
            objDouble.add(0, 3.1);
            objDouble.add(1, 1.6);
            objDouble.add(2, 2.12);
            objDouble.add(3, 14.9);
            objDouble.add(4, 1.8);
//            objDouble.add(5, 7.3);

        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("[Массив Double переполнен. Длинна массива: " + objDouble.getSize() + " элементов]");
            e2.printStackTrace();
        }

        System.out.println("Число по индексу 2: " + objDouble.get(2));
        System.out.println("Количество элементов: " + objDouble.length());
        System.out.println("Среднее арифметическое среди элементов: " + objDouble.average());
        System.out.println("Сумма всех элементов массива: " + objDouble.sum());
        System.out.println("Максимальный элемент массива: " + objDouble.max());

    }
}