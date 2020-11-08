package com.project_furama.service.employee_service.impl;

import com.project_furama.entity.employee.Position;
import com.project_furama.repository.employee_repository.PositionRepository;
import com.project_furama.service.employee_service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return this.positionRepository.findAll();
    }
}
