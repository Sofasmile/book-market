package bookmarket.demo.repository;

import java.util.List;
import bookmarket.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
 List<Book> findByTitle(String title);
}
