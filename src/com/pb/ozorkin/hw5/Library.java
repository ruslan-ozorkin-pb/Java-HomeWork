package com.pb.ozorkin.hw5;

import com.pb.ozorkin.hw3.Array;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Reader fio = new Reader();
        fio.setFio("Петров В.В.");
        book1.setNazvanie("Приключения");
        book1.setAuthor("Иванов И. И.");
        book1.setYear(2000);
        book2.setNazvanie("Словарь");
        book2.setAuthor("Сидоров А. В");
        book2.setYear(1980);
        book3.setNazvanie("Энциклопедия");
        book3.setAuthor("Гусев К. В.");
        book3.setYear(2010);
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        book1.takeBook(book1.getNazvanie());
        book2.takeBook(book2.getNazvanie());
        book3.takeBook(book3.getNazvanie());
        book1.returnBook(book1.getNazvanie());
        book2.returnBook(book2.getNazvanie());
        book3.returnBook(book3.getNazvanie());
        System.out.println(Book.getBookCount());

        System.out.println(fio.getFio() + " Взял " + Book.getBookCount() + " книги");
        System.out.println(fio.getFio() + " Взял книги: " +  book1.getNazvanie() + ", " + book2.getNazvanie() + ", " + book3.getNazvanie());
        System.out.println(fio.getFio() + " Взял книги: " + book1.getInfo() + ", " + book2.getInfo() + ", " + book3.getInfo());

        System.out.println(fio.getFio() + "Вернул книги " + Book.getBookCount() + " книги");
        System.out.println(fio.getFio() + "Вернул книги " + book1.getNazvanie() + ", " + book2.getNazvanie() + ", " + book3.getNazvanie());
        System.out.println(fio.getFio() + "Вернул книги " + book1.getInfo() + ", " + book2.getInfo() + ", " + book3.getInfo());

       /* readerArray[1].takeBook(bookArray[1].getTitle(), bookArray[2].getTitle(), bookArray[3].getTitle()); */


        Reader [] fioArray = new Reader[4];
        Book [] bookArray = new Book[4];
        bookArray [1].takeBook(bookArray[1].getNazvanie(), bookArray[2].getNazvanie());





    }
}
