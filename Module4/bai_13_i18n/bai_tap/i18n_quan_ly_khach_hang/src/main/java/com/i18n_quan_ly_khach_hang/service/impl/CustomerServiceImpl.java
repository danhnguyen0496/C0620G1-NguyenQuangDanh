package com.i18n_quan_ly_khach_hang.service.impl;

import com.i18n_quan_ly_khach_hang.entity.Customer;
import com.i18n_quan_ly_khach_hang.repository.CustomerRepository;
import com.i18n_quan_ly_khach_hang.service.CustomerService;
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
    public Customer findById(Long id) throws Exception {
        Customer target = customerRepository.findById(id).orElse(null);
        if(target == null){
            throw new Exception("Customer not found !");
        }
        return target;
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findByNameContaining(Pageable pageable, String name) {
        return this.customerRepository.findAllByFirstNameContaining(pageable, name);
    }
}
