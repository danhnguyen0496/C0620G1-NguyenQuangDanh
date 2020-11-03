package com.borrow_books.service;

import com.borrow_books.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Page<Book> findAll(Pageable pageable);

    Page<Book> findByNameContaining(Pageable pageable, String name);

    Book findById(Integer id);

    void save(Book book);

    List<Book> borrowBook(Book book, Integer id) throws Exception;

}
