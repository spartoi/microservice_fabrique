package com.borovkov.microservicefabrique.web.services;

import com.borovkov.microservicefabrique.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);

    UUID saveCustomer(CustomerDto customer);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
