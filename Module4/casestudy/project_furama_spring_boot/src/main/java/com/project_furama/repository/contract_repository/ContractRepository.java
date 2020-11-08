package com.project_furama.repository.contract_repository;

import com.project_furama.entity.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, String> {
    Page<Contract> findAllByContractId(String contractId, Pageable pageable);
}
