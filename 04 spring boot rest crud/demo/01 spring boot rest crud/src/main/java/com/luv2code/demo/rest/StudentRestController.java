package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student>thestudents;
    // define @postconstruct to load student data once !
    @PostConstruct
    public void  loaddata(){
        thestudents=new ArrayList<>();
        thestudents.add(new Student("poornima","patel"));
        thestudents.add(new Student("mario","ramayana"));
        thestudents.add(new Student("krishna","yadowans"));
    }
    // define endpoint for "/student" return a list of student
    @GetMapping("/student")
    public List<Student>getStudents(){

        return  thestudents;
    }
    // define endppoint resturn student at index
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        // just index into the list

        // check the id again list size
        if((id>=thestudents.size()) || (id<0)){
            throw  new StudentNotFoundException("student id not found :"+id);
        }
        return thestudents.get(id);

    }

}
