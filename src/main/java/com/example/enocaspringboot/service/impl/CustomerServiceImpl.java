package com.example.enocaspringboot.service.impl;

import com.example.enocaspringboot.dto.request.CustomerRequest;
import com.example.enocaspringboot.dto.response.CustomerResponse;
import com.example.enocaspringboot.entity.Customer;
import com.example.enocaspringboot.repository.CustomerRepository;
import com.example.enocaspringboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        var customer = modelMapper.map(customerRequest, Customer.class);
        return modelMapper.map(customerRepository.save(customer), CustomerResponse.class);
    }

    @Override
    public CustomerResponse updateCustomer(Long id, CustomerRequest customerRequest) {
        var updatedCustomer = customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        modelMapper.map(customerRequest, updatedCustomer);
        return modelMapper.map(customerRepository.saveAndFlush(updatedCustomer), CustomerResponse.class);
    }

    @Override
    public CustomerResponse removeById(Long id) {
        var deletedCustomer = customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        customerRepository.deleteById(id);
        return modelMapper.map(deletedCustomer, CustomerResponse.class);
    }

    @Override
    public CustomerResponse findById(Long id) {
        return modelMapper.map(
                customerRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException())
                , CustomerResponse.class);
    }

    @Override
    public List<CustomerResponse> findAll() {
        return customerRepository.findAll()
                .stream().map(customer -> modelMapper.map(customer, CustomerResponse.class))
                .toList();
    }
}
