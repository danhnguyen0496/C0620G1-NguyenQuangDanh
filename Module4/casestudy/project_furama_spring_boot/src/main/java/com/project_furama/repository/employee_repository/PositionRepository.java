package com.project_furama.repository.employee_repository;

import com.project_furama.entity.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, String> {
}
