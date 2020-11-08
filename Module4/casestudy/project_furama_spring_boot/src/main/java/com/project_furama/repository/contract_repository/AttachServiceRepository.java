package com.project_furama.repository.contract_repository;

import com.project_furama.entity.contract.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepository extends JpaRepository<AttachService, String> {
}
