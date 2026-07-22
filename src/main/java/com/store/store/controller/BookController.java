package com.store.store.controller;

import com.store.store.dto.CreateBookDto;
import com.store.store.dto.UpdateBookDto;
import com.store.store.entity.BookEntity;
import com.store.store.repository.BookRepository;
import com.store.store.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public BookEntity createBook(@RequestBody CreateBookDto createBookDto) {
        return bookService.createBook(createBookDto);
    }

    @GetMapping("/{id}")
    public BookEntity getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @GetMapping
    public List<BookEntity> getBooks() {
        return bookService.getBooks();
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable Long id, @RequestBody UpdateBookDto bookRequesDto) {
        return BookService.updateBook(id, bookRequesDto);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }
}
