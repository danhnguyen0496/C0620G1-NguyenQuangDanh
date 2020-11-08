package com.project_furama.service.employee_service;

import com.project_furama.entity.employee.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> findAll();
}
