package tps_hr;

public class GA extends Employee {
	
	public GA(String name, String surname) {
		super(name, surname);
	}
	
	public int generateProjectCode() {
		int projectCode = this.getLatestProjectCode();
		this.setLatestProjectCode(this.getLatestProjectCode()+1);
		return projectCode;
	}
	
	public void addNotification(String header,String note) {
		this.notification.add(new Notification(header,note,this));
	}
	
	public void deleteNotification(Notification n) {
		this.notification.remove(n);
	}
	
	@Override
	public String toString() {
		return "GA"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+" ("+nickname+")\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
