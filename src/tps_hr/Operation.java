package tps_hr;

import java.util.ArrayList;
import java.util.Calendar;

public class Operation extends Employee {
	private int annualTravelExpense;
	private ArrayList<Project> projectHistory;
	
	public Operation() {
		super();
	}
	public Operation(String name,String surname) {
		super(name,surname);
		projectHistory = new ArrayList<Project>();
	}
	
	public void addHistory(Project project) {
		projectHistory.add(project);
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

	@Override
	public String toString() {
		String data;
		data = "Operation"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName :"+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress()
	            +"\n"+"Starting Date:"+this.getStartingDate().getTime().toString()+"\n"+"Certificate :";
		if(this.getCertificateList().isEmpty()) {
			data+= "-";
		}else {
			data+="\n";
			for(int i=0;i<this.getCertificateList().size();i++) {
				data+=this.getCertificateList().get(i).toString();
			}
		}
		return data;
	}
	
	
}
