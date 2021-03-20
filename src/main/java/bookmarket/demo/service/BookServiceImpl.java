package bookmarket.demo.service;

import java.util.List;
import java.util.Optional;
import bookmarket.demo.model.Book;
import bookmarket.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
  @Autowired
  private BookRepository bookRepository;

  @Override
  public void create(Book book) {
    bookRepository.save(book);
  }

  @Override
  public Optional<Book> getById(Long id) {
    return bookRepository.findById(id);
  }

  @Override
  public List<Book> getAll() {
    return bookRepository.findAll();
  }

  @Override
  public Book update(Book book) {
    return bookRepository.save(book);
  }

  @Override
  public List<Book> getByTitle(String title) {
    return bookRepository.findByTitle(title);
  }
}
