package com.project_furama.repository.service_repository;

import com.project_furama.entity.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {
    Page<Service> findAllByServiceNameContaining(String serviceName, Pageable pageable);
}
