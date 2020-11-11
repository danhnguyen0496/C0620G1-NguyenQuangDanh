package com.exam_exp.service;

import com.exam_exp.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);

    Page<Customer> findAllById(Pageable pageable, String id);

    Page<Customer> findAll(Pageable pageable);

    List<Customer> findAll();

    void save(Customer customer);

    void remove(String id);

    Customer findById(String id);
}
