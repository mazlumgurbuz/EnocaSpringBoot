package com.example.enocaspringboot.dto.response;

import com.example.enocaspringboot.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResponse {
    private Long id;
    private String name;
    private String surname;
    private String eMail;
    private String phone;
    private String address;
    private List<AccountResponse> accounts;
}
