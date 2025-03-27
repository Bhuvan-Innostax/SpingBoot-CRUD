// package com.innostax.entity;

// import java.util.Date;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "employee")
// public class Employee {
//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     private int id;
//     @Column(name = "employee_name")
//     private String name ;
//     @Column(name = "department")
//     private String department;
//     @Column(name = "joining_date")
//     private Date JoiningDate;

//     //constructor

//     // 1. Default constructor 
//     public Employee(){

//     }

//     // 2. Parameter Constructor 
//     public Employee(String name , String department , Date joinDate){
//         this.name = name ;
//         this.department = department;
//         this.JoiningDate = joinDate;
        
//     }

//     // Getter Methods
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
    
//     public String getDepartment(){
//         return department;
//     }
    
//     public Date getDOJ(){
//         return JoiningDate;
//     }

//     // Setter Methods 

//     public void setName(String newName){
//         this.name = newName;
//     }
    
//     public void setDepartment(String newDept){
//         this.department = newDept;
//     }
    
//     public void setDOJ(Date newDOJ){
//         this.JoiningDate = newDOJ;
//     }

    
// }
