package ru.defezis.library.repository;

import ru.defezis.library.model.Book;

import java.util.List;

public interface BookRepository {
    Book get(int id);

    List<Book> getAll();

    Book save(Book book);

    void delete(int id);

    Book update(Book book, int id);
}
