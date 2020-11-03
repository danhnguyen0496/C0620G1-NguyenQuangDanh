package com.i18n_quan_ly_khach_hang.service;

import com.i18n_quan_ly_khach_hang.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id) throws Exception;

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findByNameContaining(Pageable pageable, String name);
}
