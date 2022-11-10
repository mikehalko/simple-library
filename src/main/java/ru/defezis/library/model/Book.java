package ru.defezis.library.model;

import org.springframework.stereotype.Component;

public class Book {
    private String description;

    public Book() {
        description = "no description";
    }

    public Book(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int id() {
        return Integer.parseInt(""+description.charAt(description.length()-1));
    }
}
