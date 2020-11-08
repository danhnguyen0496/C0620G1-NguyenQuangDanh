package com.project_furama.service.service_service.impl;

import com.project_furama.entity.service.RentType;
import com.project_furama.repository.service_repository.RentTypeRepository;
import com.project_furama.service.service_service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {

    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return this.rentTypeRepository.findAll();
    }
}
