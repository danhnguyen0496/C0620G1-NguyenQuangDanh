package com.validate_form_register.service.impl;

import com.validate_form_register.entity.User;
import com.validate_form_register.repository.UserRepository;
import com.validate_form_register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
      return this.userRepository.save(user);
    }
}
