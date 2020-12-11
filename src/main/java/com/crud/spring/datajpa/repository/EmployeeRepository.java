package com.crud.spring.datajpa.repository;

import com.crud.spring.datajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//	List<Employee> findByActive(boolean active);
	List<Employee> findByNameContaining(String name);
}
