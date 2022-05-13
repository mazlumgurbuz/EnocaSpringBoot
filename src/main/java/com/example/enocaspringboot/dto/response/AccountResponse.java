package com.example.enocaspringboot.dto.response;

import com.example.enocaspringboot.dto.request.CustomerRequest;
import com.example.enocaspringboot.entity.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponse {
    private Long id;
    private String iban;
    private AccountStatus accountStatus;
    private Double balance;
}
