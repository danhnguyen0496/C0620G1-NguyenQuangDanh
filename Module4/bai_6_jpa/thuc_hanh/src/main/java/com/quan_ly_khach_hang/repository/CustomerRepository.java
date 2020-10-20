package com.quan_ly_khach_hang.repository;

import com.quan_ly_khach_hang.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
