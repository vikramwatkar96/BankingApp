package com.vikram.BankRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vikram.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
