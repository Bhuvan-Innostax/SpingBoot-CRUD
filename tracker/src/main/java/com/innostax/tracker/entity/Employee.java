package com.innostax.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter  
@Setter  
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Make the field private

    @Column(name = "employee_name")
    private String name;  

    @Column(name = "department")
    private String department;  

    @Column(name = "drink_choice")
    private String drinkChoice;  

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, String department, String drinkChoice) {
        this.name = name;
        this.department = department;
        this.drinkChoice = drinkChoice;
    }
}
