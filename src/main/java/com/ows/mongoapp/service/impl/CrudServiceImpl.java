package com.ows.mongoapp.service.impl;

import com.ows.mongoapp.model.Book;
import com.ows.mongoapp.repository.BookRepository;
import com.ows.mongoapp.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudServiceImpl implements CrudService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book saveBook(Book book) {
       var b= bookRepository.save(book);
       return b;
    }

    @Override
    public Book getBookById(int bookId) {
        return bookRepository.findById(bookId).get();
    }

    @Override
    public boolean deleteBook(int bookId) {
        return false;
    }
}
