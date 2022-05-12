package com.example.enocaspringboot.service;

import com.example.enocaspringboot.dto.request.AccountRequest;
import com.example.enocaspringboot.dto.response.AccountResponse;

import java.util.List;

public interface AccountService {
    AccountResponse createAccount(AccountRequest request);

    AccountResponse updateAccount(Long identity, AccountRequest request);

    AccountResponse removeById(Long identity);

    AccountResponse findById(Long id);

    List<AccountResponse> findAll();
}
