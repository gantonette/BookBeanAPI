package com.github.gantonette.bookbean.controller;

import com.github.gantonette.bookbean.model.BookObject;
import com.github.gantonette.bookbean.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired BookService bookService;

    @GetMapping("/")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/books")
    List<BookObject> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    BookObject getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

}
