package tps_hr;

import fxml.newMain;

public class GA extends Employee {
	
	public GA() {
		super();
	}
	
	public GA(String name, String surname) {
		super(name, surname);
	}
	
	public int generateProjectCode() {
		int projectCode = newMain.tps.getLatestProjectCode();
		newMain.tps.setLatestProjectCode(newMain.tps.getLatestProjectCode()+1);
		return projectCode;
	}
	
	public void addNotification(String header,String note) {
		newMain.tps.notification.add(new Notification(header,note,this));
	}
	
	@Override
	public String toString() {
		return "GA"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+" ("+nickname+")\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
