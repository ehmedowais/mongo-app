package com.ows.mongoapp.service;

import com.ows.mongoapp.model.Book;

public interface CrudService {
    Book saveBook(Book book);
    Book getBookById(int bookId);
    boolean deleteBook(int bookId);
}
