package com.ronnie.booksapi.controller;

import com.ronnie.booksapi.dto.BookDTO;
import com.ronnie.booksapi.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public List<BookDTO> searchBooks(@RequestParam String query) {
        return bookService.getBookByQuery(query);
    }
}
