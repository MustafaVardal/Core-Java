package com.librarymanagementsystem;

public class BookImpl implements Book{
    private String title;
    private String author;
    private String isbn;

    public BookImpl(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }
}
