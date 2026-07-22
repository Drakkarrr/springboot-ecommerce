package com.store.store.service;

import com.store.store.dto.CreateBookDto;
import com.store.store.dto.UpdateBookDto;
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
        return null;
    }


    public BookEntity getBook(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book Not Found"));
    }

    public List<BookEntity> getBooks() {
        return null;
    }

    public static BookEntity updateBook(Long id, UpdateBookDto bookRequesDto) {
        BookEntity bookEntity = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book Not Found"));

        return bookRepository.save(bookEntity);
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
