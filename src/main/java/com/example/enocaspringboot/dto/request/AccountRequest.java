package com.example.enocaspringboot.dto.request;

import com.example.enocaspringboot.entity.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequest {
    private Long id;
    @NotNull
    @NotBlank
    private String iban;
    private AccountStatus accountStatus;
    private double balance;
}
