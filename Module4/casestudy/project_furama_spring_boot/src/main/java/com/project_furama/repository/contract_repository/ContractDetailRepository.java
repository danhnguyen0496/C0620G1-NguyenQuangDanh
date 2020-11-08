package com.project_furama.repository.contract_repository;

import com.project_furama.entity.contract.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail, String> {

    Page<ContractDetail> findAllByContractDetailId(String contractDetailId, Pageable pageable);

}
