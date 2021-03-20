package bookmarket.demo.mapper;

import bookmarket.demo.dto.BookRequestDto;
import bookmarket.demo.dto.BookResponseDto;
import bookmarket.demo.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
  public BookResponseDto createResponseDto(Book book) {
    return new BookResponseDto()
        .setId(book.getId())
        .setTitle(book.getTitle())
        .setDescription(book.getDescription())
        .setGenre(book.getGenre())
        .setYear(book.getYear());
  }

  public Book createModel(BookRequestDto bookResponseDto) {
    return new Book()
        .setTitle(bookResponseDto.getTitle())
        .setDescription(bookResponseDto.getDescription())
        .setGenre(bookResponseDto.getGenre())
        .setYear(bookResponseDto.getYear());
  }
}
