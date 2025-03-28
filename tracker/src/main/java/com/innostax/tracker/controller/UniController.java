package com.innostax.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.innostax.tracker.entity.Employee;
import com.innostax.tracker.repository.EmployeeRepository;

@RestController
public class UniController {

    @Autowired
    private EmployeeRepository repo;

    // 1. READ OPERATION: Get all employees
    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // 2. READ OPERATION: Get employee by id
    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return repo.findById(id).orElse(null); 
    }

    // 3. CREATE OPERATION: Add a new employee
    @PostMapping("/employee/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addEmployee(@RequestBody Employee employee) {
        repo.save(employee);
        return employee.getName() + " Data is Inserted To DATABASE with employeeId " + employee.getId() + " Employee likes " + employee.getDrinkChoice();
    }

    // 4. UPDATE OPERATION: Update employee details
    @PutMapping("employee/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee presentEmployee = repo.findById(id).orElse(null);
        
        if (presentEmployee != null) {
            presentEmployee.setName(employee.getName());
            presentEmployee.setDepartment(employee.getDepartment());
            presentEmployee.setDrinkChoice(employee.getDrinkChoice());

            // Save the updated employee
            repo.save(presentEmployee);

            return "Employee data is updated for " + presentEmployee.getName();
        }

        return "Employee not found";
    }

    // 5. DELETE OPERATION: Delete employee by id
    @DeleteMapping("employee/delete/{id}")
    public String removeEmployee(@PathVariable int id) {
        Employee employee = repo.findById(id).orElse(null);
        
        if (employee != null) {
            repo.delete(employee);
            return "Employee is removed from database successfully.";
        }

        return "Employee not found";
    }
}
