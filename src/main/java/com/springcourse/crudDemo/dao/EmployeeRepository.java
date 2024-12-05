package com.springcourse.crudDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.crudDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
