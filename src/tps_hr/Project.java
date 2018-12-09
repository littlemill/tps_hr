package tps_hr;

import java.util.Calendar;

public class Project {
	private String projectName,organization,note;
	private Sales sale;
	private Operation engineer;
	private Calendar startingDate,implementDate;
	private String projectCode;
	private int projectCost,profit,travelExpenses;
	private boolean hasProjectCode,isApprovedbyCEO,isApprovedbyEVP,isImplemented;
	
	public Project(String projectName,Sales sale,Operation engineer){
		setProjectName(projectName);
		setSale(sale);
		setEngineer(engineer);
		setStartingDate(Calendar.getInstance());
		setNote("");
	}
	
	public boolean closeProject() {
		if(isImplemented()&&isApprovedbyCEO()&&isApprovedbyEVP()) {
			this.getSale().setAnnualCommission(this.getSale().getAnnualCommission()+(1.5/100)*this.getProjectCost());
			this.getEngineer().setAnnualTravelExpense(this.getTravelExpenses());
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String data =  "Project Code: "+this.getProjectCode()+"\n"+"Project Name: "+this.getProjectName()+"\n"+"Organization: "+this.getOrganization()
		+"\n"+"Sale: "+this.getSale().getName()+"\n"+"Engineer: "+this.getEngineer().getName()+" "+this.getEngineer().getSurname()+"\n"+"Note: ";
		if(this.getNote().equals("")) return data + "-";
		else return data + this.getNote();
	}
	
	//getters and setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Sales getSale() {
		return sale;
	}

	public void setSale(Sales sale) {
		this.sale = sale;
	}

	public Operation getEngineer() {
		return this.engineer;
	}

	public void setEngineer(Operation engineer) {
		this.engineer = engineer;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Calendar getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Calendar startingDate) {
		this.startingDate = startingDate;
	}

	public Calendar getImplementDate() {
		return implementDate;
	}

	public void setImplementDate(Calendar implementDate) {
		this.implementDate = implementDate;
		
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public int getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(int projectCost) {
		this.projectCost = projectCost;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public boolean isApprovedbyCEO() {
		return isApprovedbyCEO;
	}

	public void setApprovedbyCEO(boolean isApprovedbyCEO) {
		this.isApprovedbyCEO = isApprovedbyCEO;
	}

	public boolean isApprovedbyEVP() {
		return isApprovedbyEVP;
	}

	public void setApprovedbyEVP(boolean isApprovedbyEVP) {
		this.isApprovedbyEVP = isApprovedbyEVP;
	}

	public boolean isImplemented() {
		return isImplemented;
	}

	public void setImplemented(boolean isImplemented) {
		this.isImplemented = isImplemented;
	}

	public int getTravelExpenses() {
		return travelExpenses;
	}

	public void setTravelExpenses(int travelExpenses) {
		this.travelExpenses = travelExpenses;
	}
	
}
