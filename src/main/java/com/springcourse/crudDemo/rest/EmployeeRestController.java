package com.springcourse.crudDemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcourse.crudDemo.dao.EmployeeDAO;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    // quick and dirty: inject employee dao

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // expose "/employees" and return list of employees
    @GetMapping("/employees")
    public String findAll() {
        return employeeDAO.findAll().toString();
    }

}
