package com.vikram.entity;

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
@Table(name = "Customer")
public class Customer {
	@Id
	private int custId;

	@Column(name = "CustomerName")
	private String custName;

	@ManyToOne
	@JoinColumn(name = "branchId", referencedColumnName = "branchId")
	private Branch custBranch;

	@OneToMany(mappedBy = "accId", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Account> accounts;

	public Customer() {
		super();
	}

	public Customer(int custId, String custName, Branch custBranch) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custBranch = custBranch;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Branch getCustBranch() {
		return custBranch;
	}

	public void setCustBranch(Branch custBranch) {
		this.custBranch = custBranch;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custBranch=" + custBranch + ", accounts="
				+ accounts + "]";
	}

}
