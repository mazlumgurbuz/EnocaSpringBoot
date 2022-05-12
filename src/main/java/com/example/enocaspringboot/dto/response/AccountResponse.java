package com.example.enocaspringboot.dto.response;

import com.example.enocaspringboot.entity.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {
    private Long id;
    private String iban;
    private AccountStatus accountStatus;
    private double balance;
}
