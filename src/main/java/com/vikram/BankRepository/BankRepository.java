package com.vikram.BankRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vikram.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
	
}
