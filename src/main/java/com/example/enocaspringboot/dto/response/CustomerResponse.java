package com.example.enocaspringboot.dto.response;

import com.example.enocaspringboot.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {
    private Long id;
    private String name;
    private String surname;
    private String eMail;
    private String phone;
    private String address;
    private List<AccountResponse> accounts;
}
