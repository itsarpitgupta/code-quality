package org.arpitjava.com.learn;

public class Developer extends Employee {

	public Developer(long empId, String empName, String empDesg) {
		super(empId, empName, empDesg);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Dev : ");
		builder.append(this.empId);
		builder.append(this.empName);
		builder.append(this.empDesg);
		return builder.toString();
	}
	
	@Override
	public void addEmp(Employee emp) {
		throw new UnsupportedOperationException("Developer does not contain any Emp.");
	}

	@Override
	public void removeEmp(Employee emp) {
		throw new UnsupportedOperationException("Developer does not contain any Emp.");
	}

}
