package tps_hr;

import java.util.ArrayList;
import java.util.Date;

public class Sales extends Employee {
	private double annualCommission;
	private ArrayList<Project> projectList;
	
	public Sales() {
		super();
		projectList = new ArrayList<Project>();
	}
	
	public projects(Project project) {
		projectList.add(project);
	}
	
}
