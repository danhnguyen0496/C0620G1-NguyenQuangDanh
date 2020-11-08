package com.project_furama.service.employee_service;

import com.project_furama.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    Page<Employee> findAllByEmployeeNameContaining(String employeeName, Pageable pageable);

    Page<Employee> findAll(Pageable pageable);

    List<Employee> findAllEmployee();

    Employee findById(String id);

    void save(Employee employee);

    void remove(String id);
}
