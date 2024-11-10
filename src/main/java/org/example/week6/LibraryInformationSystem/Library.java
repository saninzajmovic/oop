package org.example.week6.LibraryInformationSystem;
import java.util.*;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public Library() {

    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book book : books) {
            if (StringUtils.included(book.title(), title)) {
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book book : books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        // iterate the list of books and add all the matching books to the list found
        for (Book book : books) {
            if (StringUtils.included(book.year(), String.valueOf(year))) {
                found.add(book);
            }
        }
        return found;
    }



}
