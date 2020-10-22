package com.quan_ly_tinh.service;

import com.quan_ly_tinh.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface CustomerService {

    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findByNameContaining(Pageable pageable, String name);
}
