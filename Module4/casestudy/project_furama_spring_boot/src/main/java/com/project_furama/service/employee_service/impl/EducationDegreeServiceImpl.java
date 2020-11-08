package com.project_furama.service.employee_service.impl;

import com.project_furama.entity.employee.EducationDegree;
import com.project_furama.repository.employee_repository.EducationDegreeRepository;
import com.project_furama.service.employee_service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {

    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return this.educationDegreeRepository.findAll();
    }
}
