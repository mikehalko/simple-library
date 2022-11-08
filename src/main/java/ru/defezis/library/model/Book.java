package ru.defezis.library.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private final String description;

    public Book() {
        description = "no description";
    }

    public Book(String description) {
        this.description = description;
    }

    public String info() {
        return description;
    }
}
