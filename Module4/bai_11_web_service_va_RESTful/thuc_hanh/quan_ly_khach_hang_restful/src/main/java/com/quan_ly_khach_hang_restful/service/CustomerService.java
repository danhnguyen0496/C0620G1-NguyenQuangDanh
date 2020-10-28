package com.quan_ly_khach_hang_restful.service;

import com.quan_ly_khach_hang_restful.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
