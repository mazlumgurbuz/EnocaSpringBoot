package com.example.enocaspringboot.controller;

import com.example.enocaspringboot.dto.request.AccountRequest;
import com.example.enocaspringboot.dto.response.AccountResponse;
import com.example.enocaspringboot.service.impl.AccountServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestScope
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountServiceImpl accountService;

    @GetMapping(value = "/getall")
    public List<AccountResponse> getAll() {
        return accountService.findAll();
    }

    @GetMapping(value = "/getbyId/{id}")
    public AccountResponse getById(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @PostMapping()
    public AccountResponse addAccount(@RequestBody AccountRequest request) {

        return accountService.createAccount(request);
    }

    @PutMapping(value = "{identity}")
    public AccountResponse updateAccount(@PathVariable Long identity, @RequestBody AccountRequest request) {

        return accountService.updateAccount(identity, request);
    }

    @DeleteMapping(value = "{id}")
    public AccountResponse delete(@PathVariable Long id) {

        return accountService.removeById(id);
    }
}
