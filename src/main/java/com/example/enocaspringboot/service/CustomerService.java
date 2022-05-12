package com.example.enocaspringboot.service;

import com.example.enocaspringboot.dto.request.CustomerRequest;
import com.example.enocaspringboot.dto.response.CustomerResponse;

import java.util.List;
import java.util.Map;

public interface CustomerService {

    CustomerResponse createCustomer(CustomerRequest request);

    CustomerResponse updateCustomer(Long identity, CustomerRequest request);

    CustomerResponse removeById(Long identity);

    CustomerResponse findById(Long id);

    List<CustomerResponse> findAll();
}
