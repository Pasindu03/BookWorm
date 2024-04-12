package bookworm.Dto;

import lk.ijse.bookworm.Dto.Tm.BorrowTm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BorrowDto {

    private List<BorrowTm> borrowTmList;
    private String borrowId;
    private String detailId;
}
