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

import com.vikram.Services.BankServices;
import com.vikram.entity.Bank;

@RestController
@RequestMapping(path = "/app/bank")
@CrossOrigin({ "http://localhost:3000/" })
public class BankControler {

	@Autowired
	private BankServices bankServices;

	@PostMapping(path = "/save")
	public Bank createNewBank(@RequestBody Bank bank) {
		return bankServices.saveEntity(bank);
	}

	@PutMapping(path = "/update")
	public Bank updateBank(@RequestBody Bank bank) {
		return bankServices.saveEntity(bank);
	}

	@DeleteMapping(path = "delete")
	public void removeProduct(@RequestParam("id") int id) {
		bankServices.deleteEntity(id);
	}

	@GetMapping(path = "/all")
	public List<Bank> showAllBanks() {
		return bankServices.getEntities();
	}
}
