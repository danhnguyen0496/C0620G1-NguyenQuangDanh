package com.borrow_books.controller;

import com.borrow_books.entity.Book;
import com.borrow_books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String viewHomeBook(Model model, @PageableDefault(size = 4) Pageable pageable,
                               @RequestParam Optional<String> keyword) {
        String keywordOld = "";
        if (keyword.isPresent()) {
            keywordOld = keyword.get();
            model.addAttribute("listBook", this.bookService.findByNameContaining(pageable, keywordOld));
        } else {
            model.addAttribute("listBook", this.bookService.findAll(pageable));
        }
        model.addAttribute("keywordOld", keywordOld);
        return "home_book";
    }

    @GetMapping("/create/book")
    public String formCreateBook(Model model) {
        model.addAttribute("listBook", new Book());
        return "create_book";
    }

    @PostMapping("/create/book")
    public String createBook(Book book) {
        this.bookService.save(book);
        return "redirect:/";
    }

    @GetMapping("/view/detail/{id}")
    public String goFormViewDetailBook(Model model, @PathVariable Integer id) {
        model.addAttribute("book", this.bookService.findById(id));
        return "view_detail_book";
    }

//    @PostMapping("/borrow/book/{id}")
//    public String borrowBook (Book book, @PathVariable Integer id){
//
//    }

}
