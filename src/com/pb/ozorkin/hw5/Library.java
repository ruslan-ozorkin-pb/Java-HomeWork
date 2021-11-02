package com.pb.ozorkin.hw5;

import com.pb.ozorkin.hw3.Array;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключение", "Иванов И.И.",2000);
        Book book2 = new Book("Словарь","Сидоров А. В", 1980 );
        Book book3 = new Book("Энциклопедия","Гусев К. В.",2010 );
        Reader fio = new Reader("Петров И.И.", 12, "химия", 54, 12354);
        Reader fio2 = new Reader("Иванов И.И.", 13, "физика", 34, 642342);
        Reader fio3 = new Reader("Сидоров И.И.", 14, "математика", 57, 342354);
        book1.takeBook(fio.getFio(), 3);
        book1.takeBook(fio.getFio(), book1.getNazvanie(), book2.getNazvanie(),book3.getNazvanie());
        book1.takeBook(fio.getFio(),book1.getInfo(),book2.getInfo(),book3.getInfo());
        System.out.println();
        book1.returnBook(fio.getFio(), 3);
        book1.returnBook(fio.getFio(), book1.getNazvanie(), book2.getNazvanie(),book3.getNazvanie());
        book1.returnBook(fio.getFio(),book1.getInfo(),book2.getInfo(),book3.getInfo());

        System.out.println(book1.getInfo()+book2.getInfo()+book3.getInfo());
        System.out.println(fio.getInfo()+ fio2.getInfo() + fio3.getInfo());


    }
}
