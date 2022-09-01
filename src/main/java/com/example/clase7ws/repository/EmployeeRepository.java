package com.example.clase7ws.repository;

import com.example.clase7ws.entity.Employee;
import com.example.clase7ws.entity.Projections.EmployeeWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "employee", excerptProjection = EmployeeWithId.class)
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}