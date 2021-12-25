package com.pb.ozorkin.hw13_2;


import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProducerConsumer {

    public static void main(String[] args) {
        List list = new CopyOnWriteArrayList<>();
        int size = 5;
        Producer producer = new Producer(list, size);
        Consumer consumer = new Consumer(list);
        Thread t1 = new Thread(producer, "Producer");
        Thread t2 = new Thread(consumer, "Consumer");
        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {
    private final List list;
    private final int size;

    public Producer(List list, final int size) {
        this.list = list;
        this.size = size;
    }

    public void run() {
        try {
            produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void produce() throws InterruptedException {
        int i = 0;
        Random random = new Random();

        while (i >= 0) {
            synchronized (list) {
                while (list.size() == size) {
                    System.out.println(
                            "List is full." + Thread.currentThread().getName() + " is waiting. Size:" + list.size());
                    list.wait();
                }
                int x=random.nextInt(101);
                System.out.println("Produce :" + x);
                list.add(x);
                Thread.sleep(1000);
                list.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    private final List list;

    public Consumer(List list) {
        this.list = list;
    }

    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void consume() throws InterruptedException {
        while (true) {
            synchronized (list) {
                while (list.isEmpty()) {
                    System.out.println(
                            "List is empty. " + Thread.currentThread().getName() + " is waiting. Size:" + list.size());
                    list.wait();
                }
                System.out.println("Consumed :" + list.remove(0));
                Thread.sleep(1000);
                list.notify();
            }
        }
    }
}

