package com.store.store.controller;

import com.store.store.dto.CreateBookDto;
import com.store.store.entity.BookEntity;
import com.store.store.repository.BookRepository;
import com.store.store.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookService bookService;

    @PostMapping("/books")
    public BookEntity createBook(@RequestBody CreateBookDto createBookDto) {
        return bookService.createBook(createBookDto);
    }

    @GetMapping("/books/{id}")
    public BookEntity getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    public List<BookEntity> getAllBooks() {
        return null;
    }
}
