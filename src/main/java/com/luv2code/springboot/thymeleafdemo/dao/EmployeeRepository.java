package com.luv2code.springboot.thymeleafdemo.dao;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //that's it ... no need to write any code LOL!

    //no need to write any implementation class

    //add a method to sort by last name
    //Spring data JPA will automatically understand the below query and return result accordingly
    // :) How great is that
    public List<Employee> findAllByOrderByLastNameAsc();

}
