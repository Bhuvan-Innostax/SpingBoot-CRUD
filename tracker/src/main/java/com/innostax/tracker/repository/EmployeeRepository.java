package com.innostax.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innostax.tracker.entity.Employee;

public interface EmployeeRepository extends  JpaRepository<Employee,Integer>{
    
}
