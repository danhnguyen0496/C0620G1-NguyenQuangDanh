package com.project_furama.service.service_service.impl;

import com.project_furama.repository.service_repository.ServiceRepository;
import com.project_furama.service.service_service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;


    @Override
    public Page<com.project_furama.entity.service.Service> findAll(Pageable pageable) {
        return this.serviceRepository.findAll(pageable);
    }

    @Override
    public Page<com.project_furama.entity.service.Service> findAllByServiceNameContaining(String name, Pageable pageable) {
        return this.serviceRepository.findAllByServiceNameContaining(name, pageable);
    }

    @Override
    public void save(com.project_furama.entity.service.Service service) {
        this.serviceRepository.save(service);
    }

    @Override
    public void remove(String id) {
        this.serviceRepository.deleteById(id);
    }

    @Override
    public com.project_furama.entity.service.Service findById(String id) {
        return this.serviceRepository.findById(id).orElse(null);
    }

    @Override
    public List<com.project_furama.entity.service.Service> findAll() {
        return this.serviceRepository.findAll();
    }
}
