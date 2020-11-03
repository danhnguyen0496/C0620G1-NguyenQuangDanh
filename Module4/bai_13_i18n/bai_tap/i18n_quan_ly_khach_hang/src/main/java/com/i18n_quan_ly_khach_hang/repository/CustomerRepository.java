package com.i18n_quan_ly_khach_hang.repository;

import com.i18n_quan_ly_khach_hang.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);

//    @Query(value = "select *from customer where lastName like concat('%', ?1, '%')", nativeQuery = true)
//    List<Customer> searchCustomerByName(String name);
}
