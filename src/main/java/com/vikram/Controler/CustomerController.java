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

import com.vikram.Services.CustomerServices;
import com.vikram.entity.Customer;

@RestController
@RequestMapping(path = "/app/customer")
@CrossOrigin({ "http://localhost:3000/" })
public class CustomerController {
	@Autowired
	private CustomerServices customerServices;

	@PostMapping(path = "/save")
	public Customer createNewCustomer(@RequestBody Customer entity) {
		return customerServices.saveEntity(entity);
	}

	@PutMapping(path = "/update")
	public Customer updateCustomer(@RequestBody Customer entity) {
		return customerServices.saveEntity(entity);
	}

	@DeleteMapping(path = "/delete")
	public void removeCustomer(@RequestParam("id") int id) {
		customerServices.deleteEntity(id);
	}

	@GetMapping(path = "/all")
	public List<Customer> showAllBanks() {
		return customerServices.getEntities();
	}

}
