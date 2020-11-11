package com.exam_exp.repository;

import com.exam_exp.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Page<Customer> findAllByCustomerNameContaining(Pageable pageable, String name);

//    @Query(value = "select * from student where customer_name like %?1%", nativeQuery = true)
//    @Query(value = "select * from customer where customer_name like concat('%', ?1, '%')", nativeQuery = true)
//    List<Customer> searchCustomerByName(String name);

    Page<Customer> findAllById(Pageable pageable, String id);
}
