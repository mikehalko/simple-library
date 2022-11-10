package ru.defezis.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.defezis.library.model.Book;
import ru.defezis.library.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book get(int id) {
        return repository.get(id);
    }

    public List<Book> getAll() {
        return repository.getAll();
    }

    public Book save(Book book) {
        return repository.save(book);
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public Book update(Book book, int id) {
        return repository.update(book, id);
    }
}
