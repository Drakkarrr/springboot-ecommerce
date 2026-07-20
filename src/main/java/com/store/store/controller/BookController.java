package com.store.store.controller;

import com.store.store.entity.BookEntity;
import com.store.store.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/books")
    public BookEntity createBook(String title, String author, String isbn) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(title);
        bookEntity.setAuthor(author);
        bookEntity.setIsbn(isbn);
        return bookRepository.save(bookEntity);
    }


//    @PostMapping("/books")
//    public BookEntity createBook(@RequestBody BookEntity bookEntity) {
//        return bookRepository.save(bookEntity);
//    }
}
