package com.innostax.tracker.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.innostax.tracker.entity.Employee;
import com.innostax.tracker.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UniController {

    @Autowired
    EmployeeRepository repo;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        List<Employee> data = repo.findAll();
        return data;
    }

    @PostMapping("/employee/add")
    public String  postMethodName(@RequestBody Employee employee) {
        repo.save(employee);
        String res = employee.getName() + " Data is Inserted To DATABASE with employeeId  " + employee.getId() + " Employee likes "+employee.getDrinkChoice();
        return res;

    }
    
}
