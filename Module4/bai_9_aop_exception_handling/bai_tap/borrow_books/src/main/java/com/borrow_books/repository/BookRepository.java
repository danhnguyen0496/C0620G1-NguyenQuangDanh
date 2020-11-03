package com.borrow_books.repository;

import com.borrow_books.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    Page<Book> findAllByNameBookContaining(Pageable pageable, String name);

}
