package com.borrow_books.service.impl;

import com.borrow_books.entity.Book;
import com.borrow_books.repository.BookRepository;
import com.borrow_books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return this.bookRepository.findAll(pageable);
    }

    @Override
    public Page<Book> findByNameContaining(Pageable pageable, String name) {
        return this.bookRepository.findAllByNameBookContaining(pageable, name);
    }

    @Override
    public Book findById(Integer id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public List<Book> borrowBook(Book book, Integer id) throws Exception {
        if (book.getAmountBook() > 0 && book.getIdBook().equals(id)) {
            book.setAmountBook(book.getAmountBook() - 1);
        } else if (book.getAmountBook() <= 0) {
            throw new Exception("Don't have books");
        }
        return bookRepository.findAll();
    }
}
