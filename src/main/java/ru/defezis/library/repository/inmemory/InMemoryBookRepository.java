package ru.defezis.library.repository.inmemory;

import org.springframework.stereotype.Repository;
import ru.defezis.library.model.Book;
import ru.defezis.library.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {
    private final List<Book> books;

    public InMemoryBookRepository() {
        books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            books.add(new Book("book-" + i));
        }
    }

    public Book get(int id) {
        return books.get(id);
    }

    public List<Book> getAll() {
        return books;
    }

    public Book save(Book book) {
        return books.add(book) ? book : null;
    }

    public void delete(int id) {
        books.remove(id);
    }

    public Book update(Book book, int id) {
        Book bookOld = books.get(id);
        if (bookOld == null) return null;
        bookOld.setDescription(book.getDescription());
        return bookOld;
    }
}
