package com.github.gantonette.bookbean.controller;

import com.github.gantonette.bookbean.model.Book;
import com.github.gantonette.bookbean.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired BookService bookService;

    @GetMapping("/books")
    List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    Book getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @PostMapping("/books")
    Book postBook(@RequestBody Book book) {
        return bookService.postBook(book);
    }

    @PutMapping("/books/{id}")
    Book updateBook(@PathVariable String id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }
}
