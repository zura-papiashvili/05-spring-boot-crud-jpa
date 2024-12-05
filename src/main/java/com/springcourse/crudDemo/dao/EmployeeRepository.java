package com.springcourse.crudDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springcourse.crudDemo.entity.Employee;

@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
