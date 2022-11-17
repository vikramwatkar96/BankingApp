package com.vikram.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.BankRepository.EmployeeRepository;
import com.vikram.entity.Employee;

@Service
public class EmployeeServices implements DatabaseServices<Employee> {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEntity(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public Employee updateEntity(Employee entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public void deleteEntity(int id) {
		Optional<Employee> p = employeeRepository.findById(id);

		if (p != null) {
			employeeRepository.deleteById(id);
		} else {
			System.out.println("Employee " + id + " Not Found.");
		}
	}

	@Override
	public List<Employee> getEntities() {
		return employeeRepository.findAll();
	}

}
