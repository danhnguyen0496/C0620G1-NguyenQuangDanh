package com.quan_ly_khach_hang.service;

import com.quan_ly_khach_hang.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
