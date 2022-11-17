package com.vikram.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.Services.EmployeeServices;
import com.vikram.entity.Employee;

@RestController
@RequestMapping(path = "/app/employee")
@CrossOrigin({ "http://localhost:3000/" })
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;

	@PostMapping(path = "/save")
	public Employee createNewEmployee(@RequestBody Employee entity) {
		return employeeServices.saveEntity(entity);
	}

	@PutMapping(path = "/update")
	public Employee updateEmployee(@RequestBody Employee entity) {
		return employeeServices.saveEntity(entity);
	}

	@DeleteMapping(path = "/delete")
	public void removeEmployee(@RequestParam("id") int id) {
		employeeServices.deleteEntity(id);
	}

	@GetMapping(path = "/all")
	public List<Employee> showAllBanks() {
		return employeeServices.getEntities();
	}

}
