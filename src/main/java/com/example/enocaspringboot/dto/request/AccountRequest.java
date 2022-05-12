package com.example.enocaspringboot.dto.request;

import com.example.enocaspringboot.entity.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequest {
    private String iban;
    private AccountStatus accountStatus;
    private double balance;
}
