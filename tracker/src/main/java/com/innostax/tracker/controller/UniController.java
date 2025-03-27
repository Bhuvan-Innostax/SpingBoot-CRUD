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
    EmployeeRepository repo;

    // 1. READ OPERATION: Get all employees
    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // 2. READ OPERATION: Get a specific employee by ID
    @GetMapping("employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return repo.findById(id).orElse(null); // Return null if not found
    }

    // 3. CREATE OPERATION: Add a new employee
    @PostMapping("/employee/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addEmployee(@RequestBody Employee employee) {
        repo.save(employee);
        // Use getter methods instead of directly accessing fields
        return employee.getName() + " Data is Inserted To DATABASE with employeeId " + employee.getId() + " Employee likes " + employee.getDrinkChoice();
    }

    // 4. UPDATE OPERATION: Update existing employee details
    @PutMapping("employee/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee presentEmployee = repo.findById(id).orElse(null);
        
        if (presentEmployee != null) {
            // Update the employee details using setter methods
            presentEmployee.setName(employee.getName());
            presentEmployee.setDepartment(employee.getDepartment());
            presentEmployee.setDrinkChoice(employee.getDrinkChoice());

            // Save the updated employee
            repo.save(presentEmployee);

            return "Employee data is updated for " + presentEmployee.getName();
        }

        return "Employee not found";
    }

    // 5. DELETE OPERATION: Delete an employee by ID
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
