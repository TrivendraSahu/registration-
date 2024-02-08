package com.example.registration.Dao;

 // Package declaration

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.registration.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Employee getEmployeeByEmail(String email) {
        String hql = "select e from Employee e where e.email = :email";
        return entityManager.createQuery(hql, Employee.class)
                            .setParameter("email", email)
                            .getSingleResult();
    }
}

