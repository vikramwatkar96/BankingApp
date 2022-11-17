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

import com.vikram.Services.AccountServices;
import com.vikram.entity.Account;

@RestController
@RequestMapping(path = "/app/account")
@CrossOrigin({ "http://localhost:3000/" })
public class AccountController {
	@Autowired
	private AccountServices accountServices;

	@PostMapping(path = "/save")
	public Account createNewAccount(@RequestBody Account entity) {
		return accountServices.saveEntity(entity);
	}

	@PutMapping(path = "/update")
	public Account updateAccount(@RequestBody Account entity) {
		return accountServices.saveEntity(entity);
	}

	@DeleteMapping(path = "/delete")
	public void removeAccount(@RequestParam("id") int id) {
		accountServices.deleteEntity(id);
	}

	@GetMapping(path = "/all")
	public List<Account> showAllBanks() {
		return accountServices.getEntities();
	}

}
