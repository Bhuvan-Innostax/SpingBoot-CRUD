package com.innostax.tracker.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innostax.tracker.entity.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // You can add custom query methods here if necessary
}
