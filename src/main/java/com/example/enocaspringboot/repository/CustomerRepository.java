package com.example.enocaspringboot.repository;

import com.example.enocaspringboot.dto.response.CustomerResponse;
import com.example.enocaspringboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
