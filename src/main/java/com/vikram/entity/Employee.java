package com.vikram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	private int empId;

	@Column(name = "EmployeeName")
	private String empName;

	@ManyToOne
	@JoinColumn(name = "branchId", referencedColumnName = "branchId")
	private Branch empBranch;

	public Employee(int empId, String empName, Branch empBranch) {
		this.empId = empId;
		this.empName = empName;
		this.empBranch = empBranch;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Branch getBranch() {
		return empBranch;
	}

	public void setEmpBranch(Branch empBranch) {
		this.empBranch = empBranch;
	}

	public Branch getEmpBranch() {
		return empBranch;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", branch=" + empBranch + "]";
	}

}
