package tps_hr;

import java.util.ArrayList;

public class TPS {
	protected ArrayList<Operation> operationList;
	protected ArrayList<Sales> salesList;
	protected ArrayList<GA> gaList;
	protected ArrayList<Finance> financeList;
	protected ArrayList<Project> projectList;
	protected int latestProjectCode;
	
	public TPS() {
		operationList = new ArrayList<Operation>();
		salesList = new ArrayList<Sales>();
		gaList = new ArrayList<GA>();
		financeList = new ArrayList<Finance>();
		projectList = new ArrayList<Project>();
		this.setLatestProjectCode(0);		
	}
	
	public void addOperation(Operation operation) {
		this.operationList.add(operation);
	}
	
	public void addSales(Sales sales) {
		this.salesList.add(sales);
	}
	
	public void addGA(GA ga) {
		this.gaList.add(ga);
	}
	
	public void addFinance(Finance finance) {
		this.financeList.add(finance);
	}
	
	public void addProject(Project projectName) {
		this.projectList.add(projectName);
		this.setLatestProjectCode(this.latestProjectCode +1);
	}

	//getter&setter for project code
	public int getLatestProjectCode() {
		return latestProjectCode;
	}

	public void setLatestProjectCode(int latestProjectCode) {
		this.latestProjectCode = latestProjectCode;
	}
	
	
	
	
	
}
