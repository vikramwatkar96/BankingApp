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

import com.vikram.Services.BranchServices;
import com.vikram.entity.Branch;

@RestController
@RequestMapping(path = "/app/branch")
@CrossOrigin({ "http://localhost:3000/" })
public class BranchControler {

	@Autowired
	private BranchServices branchServices;

	@PostMapping(path = "/save")
	public Branch createNewBranch(@RequestBody Branch entity) {
		return branchServices.saveEntity(entity);
	}

	@PutMapping(path = "/update")
	public Branch updateBranch(@RequestBody Branch entity) {
		return branchServices.saveEntity(entity);
	}

	@DeleteMapping(path = "/delete")
	public void removeBranch(@RequestParam("id") int id) {
		branchServices.deleteEntity(id);
	}

	@GetMapping(path = "/all")
	public List<Branch> showAllBanks() {
		return branchServices.getEntities();
	}

}
