package com.store.store.service;

import com.store.store.dto.CreateBookDto;
import com.store.store.entity.BookEntity;
import com.store.store.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookEntity createBook(CreateBookDto createBookDto) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(createBookDto.getTitle());
        bookEntity.setAuthor(createBookDto.getAuthor());
        bookEntity.setIsbn(createBookDto.getIsbn());
        return bookRepository.save(bookEntity);
    }
}
