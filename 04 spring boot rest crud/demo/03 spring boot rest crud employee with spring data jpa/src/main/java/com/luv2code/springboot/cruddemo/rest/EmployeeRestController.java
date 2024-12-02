package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    // quick and dirty: inject employee dao
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService=theEmployeeService;
    }
    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee>findAll(){
        return employeeService.findall();
    }
    // add mapping for GET /employees/(employeeId)
    @GetMapping("/employees/{employeeId}")
    public  Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee=employeeService.findById(employeeId);
        if(theEmployee==null){
            throw new RuntimeException("exception id not found--"+ employeeId);

        }
        return  theEmployee;
    }
    //add mapping for POST/employee- add new employee

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbEmployee=employeeService.save(theEmployee);
        return dbEmployee;
    }
    // add mapping for PUT OR update employee
    @PutMapping("/employees")
    public  Employee udateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee=employeeService.save(theEmployee);
        return dbEmployee;

    }
    // delete operation
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee=employeeService.findById(employeeId);
        //htrow exception
        if(tempEmployee==null){
            throw new RuntimeException("Employee id not exist-"+employeeId);
        }
        employeeService.deleteById(employeeId);
        return "deleting id--"+employeeId;
    }
}
