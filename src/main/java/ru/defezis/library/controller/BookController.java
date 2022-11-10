package ru.defezis.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.defezis.library.model.Book;
import ru.defezis.library.service.BookService;

import java.util.List;

@Controller
public class BookController {
    private final BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    public Book get(int id) {
        return service.get(id);
    }

    public List<Book> getAll() {
        return service.getAll();
    }

    public Book save(Book book) {
        return service.save(book);
    }

    public void delete(int id) {
        service.delete(id);
    }

    public Book update(Book book, int id) {
        return service.update(book, id);
    }
}
