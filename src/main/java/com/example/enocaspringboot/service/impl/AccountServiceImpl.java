package com.example.enocaspringboot.service.impl;

import com.example.enocaspringboot.dto.request.AccountRequest;
import com.example.enocaspringboot.dto.response.AccountResponse;
import com.example.enocaspringboot.repository.CustomerRepository;
import com.example.enocaspringboot.service.AccountService;
import com.example.enocaspringboot.entity.Account;
import com.example.enocaspringboot.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final ModelMapper modelMapper;


    @Override
    public AccountResponse createAccount(AccountRequest request) {
        var account = modelMapper.map(request, Account.class);
        return modelMapper.map(accountRepository.save(account), AccountResponse.class);
    }

    @Override
    public AccountResponse updateAccount(Long identity, AccountRequest request) {
        var updatedAccount = accountRepository.findById(identity).orElseThrow(() -> new EntityNotFoundException());
        modelMapper.map(request, updatedAccount);
        return modelMapper.map(accountRepository.saveAndFlush(updatedAccount), AccountResponse.class);
    }

    @Override
    public AccountResponse removeById(Long identity) {
        var deleted = accountRepository.findById(identity).orElseThrow();
        accountRepository.deleteById(identity);
        return modelMapper.map(deleted, AccountResponse.class);
    }

    @Override
    public AccountResponse findById(Long id) {
        return modelMapper.map(
                accountRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException())
                , AccountResponse.class);
    }

    @Override
    public List<AccountResponse> findAll() {
        return accountRepository.findAll()
                .stream().map(account -> modelMapper.map(account, AccountResponse.class))
                .toList();
    }
}
