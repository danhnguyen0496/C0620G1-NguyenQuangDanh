package com.project_furama.service.contract_service.impl;

import com.project_furama.entity.contract.AttachService;
import com.project_furama.repository.contract_repository.AttachServiceRepository;
import com.project_furama.service.contract_service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {

    @Autowired
    private AttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAll() {
        return this.attachServiceRepository.findAll();
    }
}
