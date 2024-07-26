package com.librarymanagementsystem;

import java.util.List;

public interface Library {
    void addBook(Book book);
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
    void displayBooks();
}
