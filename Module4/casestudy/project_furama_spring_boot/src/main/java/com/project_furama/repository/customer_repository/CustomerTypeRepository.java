package com.project_furama.repository.customer_repository;

import com.project_furama.entity.customer.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository extends JpaRepository<TypeCustomer, String> {
}
