package com.project_furama.service.employee_service;

import com.project_furama.entity.employee.Position;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PositionService {
    List<Position> findAll();
}
