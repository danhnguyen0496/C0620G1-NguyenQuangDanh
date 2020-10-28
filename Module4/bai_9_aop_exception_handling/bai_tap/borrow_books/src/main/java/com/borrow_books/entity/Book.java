package com.borrow_books.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "book")
public class Book {

    @Id
    private Integer idBook;
    private String nameBook;
    private Integer amountBook;

    public Book() {
    }


    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getAmountBook() {
        return amountBook;
    }

    public void setAmountBook(Integer amountBook) {
        this.amountBook = amountBook;
    }

}
