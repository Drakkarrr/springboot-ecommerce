package com.store.store.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookDto {
    private String title;
    private String author;
    private String isbn;
}
