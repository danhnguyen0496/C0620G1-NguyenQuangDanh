package com.project_furama.service.employee_service.impl;

import com.project_furama.entity.employee.Division;
import com.project_furama.repository.employee_repository.DivisionRepository;
import com.project_furama.service.employee_service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return this.divisionRepository.findAll();
    }
}
