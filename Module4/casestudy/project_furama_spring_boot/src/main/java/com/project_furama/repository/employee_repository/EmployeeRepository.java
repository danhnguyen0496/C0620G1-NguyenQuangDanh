package com.project_furama.repository.employee_repository;

import com.project_furama.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Page<Employee> findAllByEmployeeNameContaining(String employeeName, Pageable pageable);
}
