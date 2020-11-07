package com.project_furama.service.customer_service;

import com.project_furama.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByAllCustomerNameContaining(Pageable pageable, String name);

    Customer findById(String id);

    void save(Customer customer);

    void remove(String id);
}
