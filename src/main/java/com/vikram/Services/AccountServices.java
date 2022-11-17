package com.vikram.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.BankRepository.AccountRepository;
import com.vikram.entity.Account;

@Service
public class AccountServices implements DatabaseServices<Account> {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account saveEntity(Account entity) {
		return accountRepository.save(entity);
	}

	@Override
	public Account updateEntity(Account entity) {
		return accountRepository.save(entity);
	}

	@Override
	public void deleteEntity(int id) {
		Optional<Account> p = accountRepository.findById(id);

		if (p != null) {
			accountRepository.deleteById(id);
		} else {
			System.out.println("Account " + id + " Not Found.");
		}
	}

	@Override
	public List<Account> getEntities() {
		return accountRepository.findAll();
	}

}
