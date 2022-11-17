package com.vikram.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Branch")
public class Branch {

	@Id
	int branchId;

	@Column(name = "branchName")
	String branchName;

	@ManyToOne
	@JoinColumn(name = "bankId", referencedColumnName = "bankId")
	private Bank bank;

	@Column(name = "custId")
	@OneToMany(mappedBy = "custId", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Customer> customers = new ArrayList<Customer>();

	@Column(name = "customerId")
	@OneToMany(mappedBy = "empId", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Employee> employees = new ArrayList<Employee>();

	public Branch() {
		super();
	}

	public Branch(int branchId, String branchName, Bank bank) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.bank = bank;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Bank getBank() {
		return bank;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", bankId=" + bank + "]";
	}

	public void assignBank(Bank bank2) {
		this.bank = bank2;
	}

}
