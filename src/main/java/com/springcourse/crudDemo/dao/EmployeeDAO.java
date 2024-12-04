package com.springcourse.crudDemo.dao;

import java.util.List;

import com.springcourse.crudDemo.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

}
