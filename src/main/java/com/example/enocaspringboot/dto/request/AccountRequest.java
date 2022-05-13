package com.example.enocaspringboot.dto.request;

import com.example.enocaspringboot.entity.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountRequest {
    private String iban;
    private AccountStatus accountStatus = AccountStatus.ACTIVE;
    private Double balance;
}
