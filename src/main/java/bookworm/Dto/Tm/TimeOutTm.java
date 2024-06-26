package bookworm.Dto.Tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TimeOutTm {
    private String id;
    private String name;
    private String bookId;
    private Date borrowDate;
    private Date returnDate;
}
