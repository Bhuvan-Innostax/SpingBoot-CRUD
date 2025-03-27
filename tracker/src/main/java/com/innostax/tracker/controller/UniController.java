package com.innostax.tracker.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.innostax.tracker.entity.Employee;
import com.innostax.tracker.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class UniController {

    @Autowired
    EmployeeRepository repo;

    // 1.READ OPERATION 

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        List<Employee> data = repo.findAll();
        return data;
    }

    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee data = repo.findById(id).get();
        return data;
    }

    // 2. CREATE OPERATION  
    

    @PostMapping("/employee/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String  postMethodName(@RequestBody Employee employee) {
        repo.save(employee);
        String res = employee.getName() + " Data is Inserted To DATABASE with employeeId  " + employee.getId() + " Employee likes "+employee.getDrinkChoice();
        return res;

    }
    
    
}
