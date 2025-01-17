package com.korit.servlet_study.service;

public class BookService {
    private static BookService bookService;

    private BookService() {

    }

    private static BookService getInstance() {
        if (bookService == null) {
            bookService = new BookService();
        }
        return bookService;
    }

}
