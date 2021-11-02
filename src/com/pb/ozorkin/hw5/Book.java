package com.pb.ozorkin.hw5;

public class Book {
    private String nazvanie;
    private String author;
    private int year;


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

    public  void setNazvanie (String nazvanie) {
        this.nazvanie=nazvanie;
    }
    private int bookCount = 0;

    public  int getBookCount() {
        return bookCount;
    }

    public void takeBook(Book... book) {
        System.out.println("[ проводим інвентаризацію:  ");
        for (Book autors : book) {
            System.out.print(autors + ",");
        }
        System.out.println(" ]");
    }
    public void takeBook(String names, int n) {
        System.out.println("[ " + names + " взял " + n + " книг ]");
    }

    public void takeBook(String names, String... author) {
        System.out.print("[ " + names + " взял книги: ");
        for (String autors : author) {
            System.out.print(autors + ", ");
        }
        System.out.println(" ]");

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
    public void returnBook(Book... book) {
              for (Book autors : book) {
            System.out.print(autors + ",");
        }
        System.out.println(" ]");
    }
    public void returnBook(String names, int n) {
        System.out.println("[ " + names + " вернул " + n + " книг ]");
    }

    public void returnBook(String names, String... author) {
        System.out.print("[ " + names + " вернул книги: ");
        for (String autors : author) {
            System.out.print(autors + ", ");
        }
        System.out.println(" ]");

    }




    String getInfo(){
        return nazvanie + " " + author + " " + "(" + year + " г. )";

    }

}
