package com.borovkov.microservicefabrique.web.services;

import com.borovkov.microservicefabrique.web.model.CustomerDto;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Johnny Cash").build();
    }

    @Override
    public UUID saveCustomer(CustomerDto customer) {
        return CustomerDto.builder().id(UUID.randomUUID()).build().getId();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updated customer with Id " + customerId + " with data " + customerDto.toString());
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleted customer with Id " + customerId);

    }
}
