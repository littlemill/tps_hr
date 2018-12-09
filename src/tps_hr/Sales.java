package tps_hr;

import java.util.ArrayList;

public class Sales extends Employee {
	private double annualCommission;
	private ArrayList<Project> projectHistory = new ArrayList<Project>();
	
	public Sales() {
		super();
	}
	public Sales(String name, String surname) {
		super(name, surname);
	}
	
	public String toString() {
		String data;
		data = "Sales"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName :"+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress()
	            +"\n"+"Starting Date:"+this.getStartingDate().getTime().toString()+"\n";
		return data;
	}

	//getters&setters
	public double getAnnualCommission() {
		return annualCommission;
	}

	public void setAnnualCommission(double annualCommission) {
		this.annualCommission = annualCommission;
	}

	public ArrayList<Project> getProjectHistory() {
		return projectHistory;
	}
	
	
	
}
