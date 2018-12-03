package tps_hr;

import java.util.Calendar;

public class Operation extends Employee {
	private int travelExpense;
	
	public Operation(String name,String surname) {
		super(name,surname);
	}
	
	public void implementProject(Project project) {
		Calendar rightnow = Calendar.getInstance();
		project.setImplemented(true);
		project.setImplementDate(rightnow);
	}
	
	@Override
	public String toString() {
		return "OPERATION"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+" ("+nickname+")\n"+
	           "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
