package model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class TransactionHistory {
        private int id;
        private int userId;
        private String content;
        private String receivingAccount;
        private double money;
        private LocalDate date;
}

