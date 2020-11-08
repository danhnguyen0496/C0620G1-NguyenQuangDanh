package com.project_furama.service.service_service.impl;

import com.project_furama.entity.service.ServiceType;
import com.project_furama.repository.service_repository.ServiceTypeRepository;
import com.project_furama.service.service_service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return this.serviceTypeRepository.findAll();
    }
}
