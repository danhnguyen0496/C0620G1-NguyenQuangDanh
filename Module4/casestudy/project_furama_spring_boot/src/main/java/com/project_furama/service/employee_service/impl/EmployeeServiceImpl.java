package com.project_furama.service.employee_service.impl;

import com.project_furama.entity.employee.Employee;
import com.project_furama.repository.employee_repository.EmployeeRepository;
import com.project_furama.service.employee_service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllByEmployeeNameContaining(String employeeName, Pageable pageable) {
        return this.employeeRepository.findAllByEmployeeNameContaining(employeeName, pageable);
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return this.employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(String id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void remove(String id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }
}
