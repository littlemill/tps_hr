package tps_hr;

import fxml.newMain;

public class EVP extends Employee implements Approvable {
	
	public EVP() {
		super();
	}
	public EVP(String name, String surname) {
		super(name, surname);
	}
	public void approveProject(int projectCode) {
		Project a = newMain.tps.projectCodeToProject(projectCode);
		a.setApprovedbyEVP(true);
	}
	
	public String printOperationMembers() {
		String data = "";
		for (int i=0; i<newMain.tps.operationList.size(); i++) {
			data += "ID: "+newMain.tps.operationList.get(i).getId()+"\nName: "+newMain.tps.operationList.get(i).getName()+" Surname: "
					+newMain.tps.operationList.get(i).getSurname()+"\nSalary: "+newMain.tps.operationList.get(i).getSalary()+"\n\n";
			}
		return data;
	}
	
	public String toString() {
		return "EVP"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}

}
