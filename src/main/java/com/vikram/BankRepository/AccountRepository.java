package com.vikram.BankRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
