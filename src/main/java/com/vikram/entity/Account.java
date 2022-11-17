package com.vikram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	private int accId;

	@Column(name = "balance")
	private long balance;

	@ManyToOne
	@JoinColumn(name = "custId", referencedColumnName = "custId")
	private Customer customer;

	public Account(int accId, long balance) {
		this.accId = accId;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	@Override
	public String toString() {
		return "Account [AccNo=" + accId + ", Balance=" + balance + "]";
	}

}
