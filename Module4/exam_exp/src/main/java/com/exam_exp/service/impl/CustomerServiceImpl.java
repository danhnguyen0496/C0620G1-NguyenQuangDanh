package com.exam_exp.service.impl;

import com.exam_exp.entity.Customer;
import com.exam_exp.repository.CustomerRepository;
import com.exam_exp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name) {
        return this.customerRepository.findAllByCustomerNameContaining(pageable, name);
    }

    @Override
    public Page<Customer> findAllById(Pageable pageable, String id) {
        return this.customerRepository.findAllById(pageable, id);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void remove(String id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(String id) {
        return this.customerRepository.findById(id).orElse(null);
    }
}
