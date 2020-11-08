package com.project_furama.service.employee_service;

import com.project_furama.entity.employee.EducationDegree;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EducationDegreeService {
    List<EducationDegree> findAll();
}
