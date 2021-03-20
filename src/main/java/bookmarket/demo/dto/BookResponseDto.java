package bookmarket.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BookResponseDto {
  private Long id;
  private String title;
  private int year;
  private String genre;
  private String description;
}
