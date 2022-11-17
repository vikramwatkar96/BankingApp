package com.vikram.BankRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vikram.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
