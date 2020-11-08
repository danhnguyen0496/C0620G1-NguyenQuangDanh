package com.project_furama.repository.service_repository;

import com.project_furama.entity.service.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentTypeRepository extends JpaRepository<RentType, String> {
}
