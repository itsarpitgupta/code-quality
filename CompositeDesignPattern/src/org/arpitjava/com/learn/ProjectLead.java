package org.arpitjava.com.learn;

import java.util.ArrayList;
import java.util.List;

public class ProjectLead extends Employee {

	List<Employee> employees = new ArrayList<>();
	
	public ProjectLead(long empId, String empName, String empDesg) {
		super(empId, empName, empDesg);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Project Lead : ");
		builder.append(" " + this.empId);
		builder.append(" " + this.empName);
		builder.append(" " + this.empDesg);
		builder.append(" ["+ employees+"] ");
		return builder.toString();
	}

	@Override
	public void addEmp(Employee emp) {
		employees.add(emp);
	}

	@Override
	public void removeEmp(Employee emp) {
		employees.remove(emp);
	}

	
}
