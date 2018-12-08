package tps_hr;

import fxml.*;
import java.util.ArrayList;

public class CEO extends Employee implements Approvable {
	public CEO() {
		super();
	}
	public CEO(String name, String surname) {
		super(name, surname);
	}
	
	public void approveProject(int projectCode) {
		Project a = Main.tps.projectCodeToProject(projectCode);
		a.setApprovedbyCEO(true);
	}
	
	private String printMembers(EmployeeType type) {
 		String data = new String();
 		
 		ArrayList list = new ArrayList();
 		
 		switch (type) {
 			case CEO: 
 				data += "CEO: \n";
 				list = (ArrayList<CEO>) Main.tps.getCeoList();
 				break;
 			case EVP: 
 				data += "EVP: \n";
 				list = (ArrayList<EVP>) Main.tps.getEvpList();
 				break;
 			case Finance: 
 				data += "FINANCE: \n";
 				list = (ArrayList<Finance>) Main.tps.getFinanceList();
 				break;
 			case GA: 
 				data += "GA: \n";
 				list = (ArrayList<GA>) Main.tps.getGaList();
 				break;
 			case Sales: 
 				data += "SALES: \n";
 				list = (ArrayList<Sales>) Main.tps.getSalesList();
 				break;
 			case Engineer: 
 				data += "OPERATION: \n";
 				list = (ArrayList<Operation>) Main.tps.getOperationList();
 				break;
 			default:
 				data += "CEO: \n";
 				list = (ArrayList<CEO>) Main.tps.getCeoList();
 		}
 		
 		for (int i=0; i<list.size(); i++) {
 			Employee employee = (Employee) list.get(i);
 			data += "ID: "+employee.getId()+"\nName: "+employee.getName()+" Surname: "
 					+employee.getSurname()+"\nSalary: "+employee.getSalary()+"\n\n";
 		}
 		
 		return data;
 	}
 	
	public String printAllMembers() {
		String data = "";
		for ( EmployeeType type : EmployeeType.values()) {
 			data += printMembers(type);
 		}
		return data;
	}
	
	public String toString() {
		String data;
		data = "CEO"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName : "+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age: "+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress()
	            +"\n"+"Starting Date: "+this.getStartingDate().getTime().toString()+"\n";
		
		return data;
	}
}
