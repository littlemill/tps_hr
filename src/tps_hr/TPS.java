package tps_hr;

import java.util.Map;
import java.util.ArrayList;

public class TPS {
	protected ArrayList<CEO> ceoList;
	protected ArrayList<EVP> evpList;
	protected ArrayList<Operation> operationList;
	protected ArrayList<Sales> salesList;
	protected ArrayList<GA> gaList;
	protected ArrayList<Finance> financeList;
	protected ArrayList<Project> projectList;
	protected ArrayList<Employee> resignedEmployee;
	protected ArrayList<Notification> notification;
	protected Map<String,String> loginInfo;
	public int latestProjectCode;
	
	public TPS() {
		operationList = new ArrayList<Operation>();
		ceoList = new ArrayList<CEO>();
		evpList = new ArrayList<EVP>();
		salesList = new ArrayList<Sales>();
		gaList = new ArrayList<GA>();
		financeList = new ArrayList<Finance>();
		projectList = new ArrayList<Project>();
		resignedEmployee = new ArrayList<Employee>();
		notification = new ArrayList<Notification>();
		this.setLatestProjectCode(0);		
	}

	public Project projectCodeToProject(int projectCode) {
		if (projectCode > (this.getLatestProjectCode()-1)) {
			projectCode = this.getLatestProjectCode()-1;
		}
		for(int i=0;i<projectList.size();i++) {
			if(projectList.get(i).getProjectCode() == projectCode) {
				return projectList.get(i);
			}
		}
		return projectList.get(projectList.size()-1);
	}
	
	public void addCEO(CEO ceo) {
		this.ceoList.add(ceo);
	}
	
	public void addEVP(EVP evp) {
		this.evpList.add(evp);
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
