package com.project_furama.service.contract_service;

import com.project_furama.entity.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {

    Page<Contract> findAll(Pageable pageable);

    Page<Contract> findAllByContractId(String id, Pageable pageable);

    Contract findById(String id);

    void save(Contract contract);

    void remove(String id);

    List<Contract> findAll();
}
