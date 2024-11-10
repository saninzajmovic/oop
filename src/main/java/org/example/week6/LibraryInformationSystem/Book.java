package org.example.week6.LibraryInformationSystem;

public class Book {

    private String bookTitle;
    private String publisherName;
    private int publishingYear;

    public Book(String title, String name, int year) {
        this.bookTitle = title;
        this.publisherName = name;
        this.publishingYear = year;
    }

    public String title() {
        return this.bookTitle;
    }

    public String publisher() {
        return this.publisherName;
    }

    public String year() {
        return String.valueOf(this.publishingYear);
    }

    public String toString() {
        return title() + " " + publisher() + " " + year();
    }
}
