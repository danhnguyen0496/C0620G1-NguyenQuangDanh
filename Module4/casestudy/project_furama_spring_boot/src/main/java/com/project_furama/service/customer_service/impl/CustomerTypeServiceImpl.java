package com.project_furama.service.customer_service.impl;

import com.project_furama.entity.customer.TypeCustomer;
import com.project_furama.repository.customer_repository.CustomerTypeRepository;
import com.project_furama.service.customer_service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<TypeCustomer> findAll() {
        return this.customerTypeRepository.findAll();
    }
}
