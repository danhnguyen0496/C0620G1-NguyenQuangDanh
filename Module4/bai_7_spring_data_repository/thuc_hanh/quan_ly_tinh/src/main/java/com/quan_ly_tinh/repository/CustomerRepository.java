package com.quan_ly_tinh.repository;

import com.quan_ly_tinh.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);

    @Query(value = "select *from customer where lastName like concat('%', ?1, '%')", nativeQuery = true)
    List<Customer> searchCustomerByName(String name);
}
