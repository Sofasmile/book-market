package bookmarket.demo.service;

import java.util.List;
import java.util.Optional;

import bookmarket.demo.model.Book;

public interface BookService {
  void create(Book book);

  Optional<Book> getById(Long id);

  List<Book> getAll();

  Book update(Book book);

  List<Book> getByTitle(String title);
}
