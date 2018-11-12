package org.arpitjava.com.learn;

public class Test {

	public static void main(String[] args) {
		Developer dev1 = new Developer(001, "Amit", "Developer");
		Developer dev2 = new Developer(002, "Rohan", "Developer");
		Developer dev3 = new Developer(003, "Aman", "Developer");
		Developer dev4 = new Developer(007, "Arpit", "Developer");
		
		TeamLead lead1 = new TeamLead(004, "Aditya", "Team Lead");
		TeamLead lead2 = new TeamLead(005, "Laxhmi", "Team Lead");
		
		ProjectLead projectLead1 = new ProjectLead(006, "Nitesh", "Project Lead");
		
		lead1.addEmp(dev1);
		lead1.addEmp(dev2);
		
		lead2.addEmp(dev4);
		lead2.addEmp(dev3);
		
		projectLead1.addEmp(lead1);
		projectLead1.addEmp(lead2);
		
		System.out.println(projectLead1);
	}

}
