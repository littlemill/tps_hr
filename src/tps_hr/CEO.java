package tps_hr;

import fxml.newMain;

public class CEO extends Employee implements Approvable {
	public CEO() {
		super();
	}
	public CEO(String name, String surname) {
		super(name, surname);
	}
	
	public void approveProject(int projectCode) {
		Project a = newMain.tps.projectCodeToProject(projectCode);
		a.setApprovedbyCEO(true);
	}
	
	public String printAllMembers() {
		String data = "";
		
		data += "CEO: \n";
		for (int i=0; i<newMain.tps.ceoList.size(); i++) {
			data += "ID: "+newMain.tps.ceoList.get(i).getId()+"\nName: "+newMain.tps.ceoList.get(i).getName()+" Surname: "
					+newMain.tps.ceoList.get(i).getSurname()+"\nSalary: "+newMain.tps.ceoList.get(i).getSalary()+"\n\n";
			}
		data += "EVP: \n";
		for (int i=0; i<newMain.tps.evpList.size(); i++) {
			data += "ID: "+newMain.tps.evpList.get(i).getId()+"\nName: "+newMain.tps.evpList.get(i).getName()+" Surname: "
					+newMain.tps.evpList.get(i).getSurname()+"\nSalary: "+newMain.tps.evpList.get(i).getSalary()+"\n\n";
			}
		data += "OPERATION: \n";
		for (int i=0; i<newMain.tps.operationList.size(); i++) {
			data += "ID: "+newMain.tps.operationList.get(i).getId()+"\nName: "+newMain.tps.operationList.get(i).getName()+" Surname: "
					+newMain.tps.operationList.get(i).getSurname()+"\nSalary: "+newMain.tps.operationList.get(i).getSalary()+"\n\n";
			}
		data += "SALES: \n";
		for (int i=0; i<newMain.tps.salesList.size(); i++) {
			data += "ID: "+newMain.tps.salesList.get(i).getId()+"\nName: "+newMain.tps.salesList.get(i).getName()+" Surname: "
					+newMain.tps.salesList.get(i).getSurname()+"\nSalary: "+newMain.tps.salesList.get(i).getSalary()+"\n\n";
			}
		data += "GA: \n";
		for (int i=0; i<newMain.tps.gaList.size(); i++) {
			data += "ID: "+newMain.tps.gaList.get(i).getId()+"\nName: "+newMain.tps.gaList.get(i).getName()+" Surname: "
					+newMain.tps.gaList.get(i).getSurname()+"\nSalary: "+newMain.tps.gaList.get(i).getSalary()+"\n\n";
			}
		data += "FINANCE: \n";
		for (int i=0; i<newMain.tps.financeList.size(); i++) {
			data += "ID: "+newMain.tps.financeList.get(i).getId()+"\nName: "+newMain.tps.financeList.get(i).getName()+" Surname: "
					+newMain.tps.financeList.get(i).getSurname()+"\nSalary: "+newMain.tps.financeList.get(i).getSalary()+"\n\n";
			}
		return data;
	}
	
	public String toString() {
		return "CEO"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
