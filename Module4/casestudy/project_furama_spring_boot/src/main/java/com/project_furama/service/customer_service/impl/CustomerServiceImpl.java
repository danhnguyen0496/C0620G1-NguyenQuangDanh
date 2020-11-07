package com.project_furama.service.customer_service.impl;

import com.project_furama.entity.customer.Customer;
import com.project_furama.repository.customer_repository.CustomerRepository;
import com.project_furama.service.customer_service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findByAllCustomerNameContaining(Pageable pageable, String name) {
        return this.customerRepository.findAllByCustomerNameContaining(pageable, name);
    }

    @Override
    public Customer findById(String id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void remove(String id) {
        this.customerRepository.deleteById(id);
    }
}
