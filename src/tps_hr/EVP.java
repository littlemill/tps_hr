package tps_hr;

import fxml.Main;

public class EVP extends Employee implements Approvable {
	
	public EVP() {
		super();
	}
	public EVP(String name, String surname) {
		super(name, surname);
	}
	public void approveProject(Project project) {
		project.setApprovedbyEVP(true);
	}
	
	public String printOperationMembers() {
		String data = "";
		for (int i=0; i<Main.tps.operationList.size(); i++) {
			data += "ID: "+Main.tps.operationList.get(i).getId()+"\nName: "+Main.tps.operationList.get(i).getName()+" Surname: "
					+Main.tps.operationList.get(i).getSurname()+"\nSalary: "+Main.tps.operationList.get(i).getSalary()+"\n\n";
			}
		return data;
	}
	
	public String toString() {
		String data;
		data = "EVP"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName : "+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age: "+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address : "+this.getAddress()
	            +"\n"+"Starting Date: "+this.getStartingDate().getTime().toString()+"\n";
	
		return data;
	}

}
