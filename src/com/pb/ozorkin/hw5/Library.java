package com.pb.ozorkin.hw5;

import com.pb.ozorkin.hw3.Array;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Приключение", "Иванов И.И.",2000);
        Book book2 = new Book("Словарь","Сидоров А. В", 1980 );
        Book book3 = new Book("Энциклопедия","Гусев К. В.",2010 );
        Reader fio = new Reader("Петров И.И.", 12, "химия", 54, 552323);
        Reader fio2 = new Reader("Иванов И.И.", 12, "химия", 54, 552323);
        Reader fio3 = new Reader("Сидоров И.И.", 12, "химия", 54, 552323);
        book1.takeBook(fio.getFio(), 3);
        book1.takeBook(fio.getFio(), book1.getNazvanie(), book2.getNazvanie(),book3.getNazvanie());
        book1.takeBook(fio.getFio(),book1.getInfo(),book2.getInfo(),book3.getInfo());
        System.out.println();
        book1.returnBook(fio.getFio(), 3);
        book1.returnBook(fio.getFio(), book1.getNazvanie(), book2.getNazvanie(),book3.getNazvanie());
        book1.returnBook(fio.getFio(),book1.getInfo(),book2.getInfo(),book3.getInfo());

        System.out.println("["+book1.getInfo()+book2.getInfo()+book3.getInfo()+"]");
        System.out.println("["+fio.getInfo()+ fio2.getInfo() + fio3.getInfo() +"]");




       /* readerArray[1].takeBook(bookArray[1].getTitle(), bookArray[2].getTitle(), bookArray[3].getTitle()); */


    /*    Reader [] readerArray = new Reader[4];
        readerArray [1]= new Reader ()
        Book [] bookArray = new Book[4];
        readerArray[1].takeBook(bookArray[1].getNazvanie(), bookArray[2].getNazvanie(), bookArray[3].getYear()); */


    }
}
