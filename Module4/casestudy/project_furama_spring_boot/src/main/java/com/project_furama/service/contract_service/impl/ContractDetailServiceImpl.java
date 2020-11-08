package com.project_furama.service.contract_service.impl;

import com.project_furama.entity.contract.ContractDetail;
import com.project_furama.repository.contract_repository.ContractDetailRepository;
import com.project_furama.repository.contract_repository.ContractRepository;
import com.project_furama.service.contract_service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {

    @Autowired
    private ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return this.contractDetailRepository.findAll();
    }

    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return this.contractDetailRepository.findAll(pageable);
    }

    @Override
    public Page<ContractDetail> findAllByContractDetailId(String id, Pageable pageable) {
        return this.contractDetailRepository.findAllByContractDetailId(id, pageable);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        this.contractDetailRepository.save(contractDetail);
    }
}
