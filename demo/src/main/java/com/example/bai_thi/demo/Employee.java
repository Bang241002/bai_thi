package com.example.bai_thi.demo;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;





public class Employee {

    public void Employee(String name, double wage) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setWage(5);
        EntityManager entityManager = null;
        entityManager.persist(employee);
    }

    private void setWage(double salary) {
    }

    private void setName(String name) {
    }

    public void setEmployee(Employee add) {
    }
}