package com.project_furama.repository.customer_repository;

import com.project_furama.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);
}
