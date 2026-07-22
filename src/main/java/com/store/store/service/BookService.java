package com.store.store.service;

import com.store.store.dto.CreateBookDto;
import com.store.store.entity.BookEntity;
import com.store.store.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookEntity createBook(CreateBookDto createBookDto) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(createBookDto.getTitle());
        bookEntity.setAuthor(createBookDto.getAuthor());
        bookEntity.setIsbn(createBookDto.getIsbn());
        return bookRepository.save(bookEntity);
    }


    public BookEntity getBook(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book Not Found"));
    }

    public List<BookEntity> getBooks() {
        return bookRepository.findAll();
    }
}
