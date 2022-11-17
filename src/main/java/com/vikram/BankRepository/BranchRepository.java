package com.vikram.BankRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vikram.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
