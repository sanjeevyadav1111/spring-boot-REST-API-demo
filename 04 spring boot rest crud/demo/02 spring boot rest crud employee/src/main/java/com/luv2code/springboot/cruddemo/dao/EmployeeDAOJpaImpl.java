package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class EmployeeDAOJpaImpl implements EmployeeDAO {
    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;

    }

    @Override
    public List<Employee> findall() {
        // crreat a query
        TypedQuery<Employee>thequery= entityManager.createQuery("from Employee",Employee.class);
        // execute query and get result list
        List<Employee>employees=thequery.getResultList();
        // return the ressults

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        // get employee
        Employee theEmployee=entityManager.find(Employee.class,theId);
        // return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        // save employee
        Employee dbEmployee=entityManager.merge(theEmployee);

        // return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
    // find Employee by Id
        Employee theEmployee=entityManager.find(Employee.class,theId);
        //remove employee
        entityManager.remove(theEmployee);
    }
}