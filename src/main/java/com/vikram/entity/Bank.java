package com.vikram.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bank")
public class Bank {
	@Id
	private int bankId;
	private String bankName;

	@Column(name = "branchId")
	@OneToMany(mappedBy = "branchId", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Branch> branches = new ArrayList<Branch>();

	public Bank() {
		super();
	}

	public Bank(int bankId) {
		super();
		this.bankId = bankId;
	}

	public Bank(int bankId, String bankName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void addBranch(Branch branch) {
		branches.add(branch);
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", branches=" + branches + "]";
	}
}
