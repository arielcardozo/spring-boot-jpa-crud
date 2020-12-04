package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Employee;
import com.bezkoder.spring.datajpa.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//	List<Employee> findByActive(boolean active);
	List<Employee> findByNameContaining(String name);
}
