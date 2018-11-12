package org.arpitjava.com.learn;

public abstract class Employee {

	protected long empId;
	protected String empName;
	protected String empDesg;

	public Employee(long empId, String empName, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
	}

	public abstract String toString();

	public void addEmp(Employee emp) {

	}

	public void removeEmp(Employee emp) {

	}

}
