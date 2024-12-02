package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO  {
    List<Employee>findall();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
