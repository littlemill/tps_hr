package tps_hr;

import java.util.Date;

public class GA extends Employee {
	private Project projectName;
	private Date date;
	
	public GA() {
		super();
	}
	
	public generateProject(Project projectName, Sales sales, Operation operation, Date date) {
		this.addProject(projectName);
		sales.projects(projectName);
		
	}
	

}
