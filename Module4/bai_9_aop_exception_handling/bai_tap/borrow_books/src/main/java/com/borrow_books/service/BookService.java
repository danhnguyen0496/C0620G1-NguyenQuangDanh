package com.borrow_books.service;

import com.borrow_books.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {

    Page<Book> findAll(Pageable pageable);

    Page<Book> findByNameContaining(Pageable pageable, String name);

    Book findById(Integer id);

    void save(Book book);
}
