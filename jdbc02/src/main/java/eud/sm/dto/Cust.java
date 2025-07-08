package eud.sm.dto;

import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder


public class Cust {
    private String custId;
    private String custPwd;
    private String custName;
    private Timestamp custRegdate;
    private Timestamp custUpdate;


}
