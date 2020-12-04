package com.bezkoder.spring.datajpa.controller;

import com.bezkoder.spring.datajpa.model.Employee;
import com.bezkoder.spring.datajpa.model.Tutorial;
import com.bezkoder.spring.datajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllTutorials(@RequestParam(required = false) String name) {
		try {
			List<Employee> employees = new ArrayList<Employee>();

			if (name == null)
				employeeRepository.findAll().forEach(employees::add);
			else
				employeeRepository.findByNameContaining(name).forEach(employees::add);

			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(employees, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {
		Optional<Employee> employeeData = employeeRepository.findById(id);

		if (employeeData.isPresent()) {
			return new ResponseEntity<>(employeeData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/employees/bulk")
	public ResponseEntity<HttpStatus> createEmployee(@RequestBody List<Employee> employees) {
		try {
			for (Employee employee : employees) {

			Employee _emp = employeeRepository
					.save(new Employee(
							employee.getName(),
							employee.getNumber(),
							employee.getState(),
							employee.getZip(),
							employee.getDOB(),
							employee.getAge(),
							employee.getSex(),
							employee.getMaritalDesc(),
							employee.getCitizenDesc(),
							employee.getHispanicLatino(),
							employee.getRaceDesc(),
							employee.getDateOfHire(),
							employee.getDateOfTermination(),
							employee.getReasonOfTerm(),
							employee.getStatus(),
							employee.getDepartment(),
							employee.getPosition(),
							employee.getPayRate(),
							employee.getManagerName(),
							employee.getEmpSource(),
							employee.getPerformanceScore())
					);
			}
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployeeBulk(@RequestBody Employee employee) {
		try {
			Employee _emp = employeeRepository
					.save(new Employee(
							employee.getName(),
							employee.getNumber(),
							employee.getState(),
							employee.getZip(),
							employee.getDOB(),
							employee.getAge(),
							employee.getSex(),
							employee.getMaritalDesc(),
							employee.getCitizenDesc(),
							employee.getHispanicLatino(),
							employee.getRaceDesc(),
							employee.getDateOfHire(),
							employee.getDateOfTermination(),
							employee.getReasonOfTerm(),
							employee.getStatus(),
							employee.getDepartment(),
							employee.getPosition(),
							employee.getPayRate(),
							employee.getManagerName(),
							employee.getEmpSource(),
							employee.getPerformanceScore())
					);
			return new ResponseEntity<>(_emp, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateTutorial(@PathVariable("id") long id, @RequestBody Employee employee) {
		Optional<Employee> employeeData = employeeRepository.findById(id);

		if (employeeData.isPresent()) {
			Employee _emp = employeeData.get();
			_emp.setName(employee.getName());
			_emp.setNumber(employee.getNumber());
			_emp.setDOB(employee.getDOB());
			_emp.setAge(employee.getAge());
			_emp.setSex(employee.getSex());
			_emp.setMaritalDesc(employee.getMaritalDesc());
			_emp.setCitizenDesc(employee.getCitizenDesc());
			_emp.setHispanicLatino(employee.getHispanicLatino());
			_emp.setRaceDesc(employee.getRaceDesc());
			_emp.setDateOfHire(employee.getDateOfHire());
			_emp.setDateOfTermination(employee.getDateOfTermination());
			_emp.setReasonOfTerm(employee.getReasonOfTerm());
			_emp.setStatus(employee.getStatus());
			_emp.setDepartment(employee.getDepartment());
			_emp.setPosition(employee.getPosition());
			_emp.setPayRate(employee.getPayRate());
			_emp.setManagerName(employee.getManagerName());
			_emp.setEmpSource(employee.getEmpSource());
			_emp.setPerformanceScore(employee.getPerformanceScore());
			return new ResponseEntity<>(employeeRepository.save(_emp), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
		try {
			employeeRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/employees")
	public ResponseEntity<HttpStatus> deleteAllTutorials() {
		try {
			employeeRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	/*@GetMapping("/employees/actived")
	public ResponseEntity<List<Employee>> findByActive() {
		try {
			List<Employee> employees = employeeRepository.findByActive(true);

			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(employees, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}*/

}
