package com.innostax.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "employee_name")
    public String name;

    @Column(name = "department")
    public String department;

    @Column(name = "drink_choice")
    public String drinkChoice;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String department, String drinkChoice) {
        this.name = name;
        this.department = department;
        this.drinkChoice = drinkChoice;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDrinkChoice() {
        return drinkChoice;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDrinkChoice(String drinkChoice) {
        this.drinkChoice = drinkChoice;
    }
}
