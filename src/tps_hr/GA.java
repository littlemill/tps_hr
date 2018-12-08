package tps_hr;

import fxml.Main;

public class GA extends Employee {
	
	public GA() {
		super();
	}
	
	public GA(String name, String surname) {
		super(name, surname);
	}
	
	public int generateProjectCode() {
		int projectCode = Main.tps.getLatestProjectCode();
		Main.tps.setLatestProjectCode(Main.tps.getLatestProjectCode()+1);
		return projectCode;
	}
	
	public void addNotification(String header,String note) {
		Main.tps.notification.add(new Notification(header,note,this));
	}
	
	@Override
	public String toString() {
		String data;
		data = "GA"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName : "+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age: "+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address : "+this.getAddress()
	            +"\n"+"Starting Date: "+this.getStartingDate().getTime().toString()+"\n"+"Certificate : ";
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
