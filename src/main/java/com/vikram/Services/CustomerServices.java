package com.vikram.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.BankRepository.CustomerRepository;
import com.vikram.entity.Customer;

@Service
public class CustomerServices implements DatabaseServices<Customer> {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveEntity(Customer entity) {
		return customerRepository.save(entity);
	}

	@Override
	public Customer updateEntity(Customer entity) {
		return customerRepository.save(entity);
	}

	@Override
	public void deleteEntity(int id) {
		Optional<Customer> p = customerRepository.findById(id);

		if (p != null) {
			customerRepository.deleteById(id);
		} else {
			System.out.println("Customer " + id + " Not Found.");
		}	
	}

	@Override
	public List<Customer> getEntities() {
		return customerRepository.findAll();

	}

}
