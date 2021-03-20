package bookmarket.demo.dto;

import lombok.Data;

@Data
public class BookRequestDto {
  private String title;
  private int year;
  private String genre;
  private String description;
}
