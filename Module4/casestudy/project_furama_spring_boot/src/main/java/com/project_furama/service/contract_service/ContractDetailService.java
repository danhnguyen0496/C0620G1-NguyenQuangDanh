package com.project_furama.service.contract_service;

import com.project_furama.entity.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();

    Page<ContractDetail> findAll(Pageable pageable);

    Page<ContractDetail> findAllByContractDetailId(String id, Pageable pageable);

    void save(ContractDetail contractDetail);
}
