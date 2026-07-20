package com.store.store.repository;

import com.store.store.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
