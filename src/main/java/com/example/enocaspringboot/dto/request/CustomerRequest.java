package com.example.enocaspringboot.dto.request;

import com.example.enocaspringboot.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private Long id;
    private String name;
    private String surname;
    private String eMail;
    private String phone;
    private String address;
    private List<AccountRequest> accounts;

}
