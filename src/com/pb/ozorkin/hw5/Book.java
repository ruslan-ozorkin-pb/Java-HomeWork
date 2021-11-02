package com.pb.ozorkin.hw5;

public class Book {
    private String nazvanie;
    private String author;
    private int year;
    private static int bookCount = 0;

    public static int getBookCount() {
        return bookCount;
    }

    public Book() {
    }
    public Book(String nazvanie, String author, int year) {
        this.nazvanie=nazvanie;
        this.author=author;
        this.year=year;
           }
    public Book(String nazvanie) {
        this.nazvanie=nazvanie;
           }

    String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie (String nazvanie) {
        this.nazvanie=nazvanie;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void takeBook(String nazvanie) {

        System.out.println("Взял :" + nazvanie);
        bookCount++;
    }
    public void takeBook(String fio, String nazvanie, int year)
    {System.out.println(nazvanie + " " + year + " г.");
        bookCount++;
    }
    public void returnBook (String... nazvanies) {
        for (String nazvanie: nazvanies) {
            System.out.println(nazvanie);


        }
    }


    String getInfo(){
        return nazvanie + " " + author + " " + "(" + year + " г. )";

    }

}
