package tps_hr;

import java.util.ArrayList;
import java.util.Calendar;

public class Operation extends Employee {
	private int annualTravelExpense;
	private ArrayList<Project> projectHistory = new ArrayList<Project>();
	
	public Operation() {
		super();
	}
	
	public Operation(String name,String surname) {
		super(name,surname);
	}
	
	public void implementProject(Project project,int travelexpense) {
		Calendar rightnow = Calendar.getInstance();
		project.setImplemented(true);
		project.setImplementDate(rightnow);
		project.setTravelExpenses(travelexpense);
	}
	
	//getter & setter
	public int getAnnualTravelExpense() {
		return annualTravelExpense;
	}

	public void setAnnualTravelExpense(int annualTravelExpense) {
		this.annualTravelExpense = annualTravelExpense;
	}

	public ArrayList<Project> getProjectHistory() {
		return projectHistory;
	}
	public void setProjectHistory(ArrayList<Project> projectHistory) {
		this.projectHistory = projectHistory;
	}
	@Override
	public String toString() {
		String data;
		data = "Operation"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName : "+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age: "+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address : "+this.getAddress()
	            +"\n"+"Starting Date: "+this.getStartingDate().getTime().toString()+"\n";
		return data;
	}
	
	
}
