package com.project_furama.service.employee_service.impl;

import com.project_furama.entity.employee.User;
import com.project_furama.repository.employee_repository.UserRepository;
import com.project_furama.service.employee_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
