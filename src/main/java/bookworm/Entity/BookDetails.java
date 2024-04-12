package bookworm.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "book_detils")
public class BookDetails {

    @Id
    private String bookDetailId;

    @ManyToOne
    private Book book;
    @ManyToOne
    private Borrow borrow;

    private String status;
    private LocalDate borrowDate;
    private LocalDate returnDate;

}
