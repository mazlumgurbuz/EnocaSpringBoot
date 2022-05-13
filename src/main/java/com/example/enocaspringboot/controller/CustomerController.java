package com.example.enocaspringboot.controller;

import com.example.enocaspringboot.dto.request.CustomerRequest;
import com.example.enocaspringboot.dto.response.CustomerResponse;
import com.example.enocaspringboot.service.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequestScope
@CrossOrigin
public class CustomerController {

    private final CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }
    @GetMapping(value = "/getall")
    public List<CustomerResponse> getAll() {
        return customerServiceImpl.findAll();
    }

    @GetMapping(value = "/getbyId/{id}")
    public CustomerResponse getById(@PathVariable Long id) {
        return customerServiceImpl.findById(id);
    }

    @PostMapping()
    public CustomerResponse addCustomer(@RequestBody CustomerRequest request) {

        return customerServiceImpl.createCustomer(request);
    }

    @PutMapping(value = "{identity}")
    public CustomerResponse updateCustomer(@PathVariable Long identity, @RequestBody CustomerRequest request) {

        return customerServiceImpl.updateCustomer(identity, request);
    }

    @DeleteMapping(value = "{id}")
    public CustomerResponse delete(@PathVariable Long id) {

        return customerServiceImpl.removeById(id);
    }
}
