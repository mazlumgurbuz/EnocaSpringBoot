package com.example.enocaspringboot.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRequest {
    private String name;
    private String surname;
    private String eMail;
    private String phone;
    private String address;
    private List<AccountRequest> accounts;
}
