package com.example.enocaspringboot.config;

import com.example.enocaspringboot.dto.request.CustomerRequest;
import com.example.enocaspringboot.entity.Account;
import com.example.enocaspringboot.entity.Customer;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Objects;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper mapper() {
        var mapper = new ModelMapper();
        return mapper;
    }
}