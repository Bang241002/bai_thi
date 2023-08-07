package com.example.bai_thi.demo;


import javax.persistence.EntityManager;
import java.util.List;

public class Employees {
    private EntityManager entityManager;

    public List<Employee> Employees() {
        return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }
}