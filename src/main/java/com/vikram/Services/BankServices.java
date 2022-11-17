package com.vikram.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vikram.BankRepository.BankRepository;
import com.vikram.entity.Bank;

@Service
public class BankServices implements DatabaseServices<Bank> {
	@Autowired
	private BankRepository bankRepository;
	
	public Bank saveEntity(Bank entity) { 
	return bankRepository.save(entity);
	}

	@Override
	public Bank updateEntity(Bank entity) {
		return bankRepository.save(entity);
	}

	@Override
	public void deleteEntity(int id) {
		Optional<Bank> p = bankRepository.findById(id);

		if (p != null) {
			bankRepository.deleteById(id);
		} else {
			System.out.println("Bank " + id + " Not Found.");
		}		
	}

	@Override
	public List<Bank> getEntities() {		
		return bankRepository.findAll();
	}
	
}
