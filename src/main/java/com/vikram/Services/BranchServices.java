package com.vikram.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.BankRepository.BranchRepository;
import com.vikram.entity.Branch;

@Service
public class BranchServices implements DatabaseServices<Branch> {

	@Autowired
	private BranchRepository branchRepository;
		
	public Branch saveEntity(Branch entity) { 
		return branchRepository.save(entity);
		}

		@Override
		public Branch updateEntity(Branch entity) {
			return branchRepository.save(entity);
		}

		@Override
		public void deleteEntity(int id) {
			Optional<Branch> p = branchRepository.findById(id);

			if (p != null) {
				branchRepository.deleteById(id);
			} else {
				System.out.println("Branch " + id + " Not Found.");
			}		
		}

		@Override
		public List<Branch> getEntities() {		
			return branchRepository.findAll();
		}
}
