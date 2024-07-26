package com.librarymanagementsystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    LibraryImpl library = new LibraryImpl();
   // Book book = new BookImpl("Head First Design Patterns"," Eric Freeman","13. 978-0596007126");
    library.addBook(new BookImpl("Head First Design Patterns", "Eric Freeman","978-0596007126"));
    library.addBook(new BookImpl("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin","978-0132350884"));


    //search a book by title
        List<Book> results = library.searchByTitle("Head");
        for (Book book : results){
            System.out.println("======================");
            System.out.println("Found book by title: " + book.getTitle());
        }
        library.displayBooks();
    // search by author
        results =library.searchByAuthor("Robert");
        for (Book books : results ){
            System.out.println("======================");
            System.out.println("Found book by author: " + books.getTitle());
        }
        library.displayBooks();


    }
}
