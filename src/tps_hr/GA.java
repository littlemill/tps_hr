package tps_hr;

import java.util.Date;

public class GA extends Employee {
	private int projectCode;
	
	public GA() {
		super();
	}
	
	public void generateProjectCode(String projectName, Sales sales, Operation operation, Date date) {
		Project project = new Project(projectName, sales, operation);
		this.addProject(project);
		sales.projects(project);
		operation.projects(project);
		project.hasProjectCode = true;
	}

	public int getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}
	
	
}
