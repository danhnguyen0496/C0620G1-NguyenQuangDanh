package com.project_furama.service.service_service;

import com.project_furama.entity.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {

    Page<Service> findAll(Pageable pageable);

    Page<Service> findAllByServiceNameContaining(String name, Pageable pageable);

    void save(Service service);

    void remove(String id);

    Service findById(String id);

    List<Service> findAll();

}
