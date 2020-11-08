package com.project_furama.service.contract_service.impl;

import com.project_furama.entity.contract.Contract;
import com.project_furama.repository.contract_repository.ContractRepository;
import com.project_furama.service.contract_service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return this.contractRepository.findAll(pageable);
    }

    @Override
    public Page<Contract> findAllByContractId(String id, Pageable pageable) {
        return this.contractRepository.findAllByContractId(id, pageable);
    }

    @Override
    public Contract findById(String id) {
        return this.contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        this.contractRepository.save(contract);
    }

    @Override
    public void remove(String id) {
        this.contractRepository.deleteById(id);
    }

    @Override
    public List<Contract> findAll() {
        return this.contractRepository.findAll();
    }
}
