package com.exam_exp.service.impl;

import com.exam_exp.entity.TypeCustomer;
import com.exam_exp.repository.TypeCustomerRepository;
import com.exam_exp.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    @Autowired
    private TypeCustomerRepository typeCustomerRepository;

    @Override
    public List<TypeCustomer> findAll() {
        return this.typeCustomerRepository.findAll();
    }
}
