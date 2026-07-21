package com.store.store.controller;

import com.store.store.dto.CreateBookDto;
import com.store.store.entity.BookEntity;
import com.store.store.repository.BookRepository;
import com.store.store.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public BookEntity createBook(@RequestBody CreateBookDto createBookDto) {
        return bookService.createBook(createBookDto);
    }
}
