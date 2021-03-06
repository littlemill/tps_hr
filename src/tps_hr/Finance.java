package tps_hr;

import java.util.ArrayList;

import fxml.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Finance extends Employee {
	protected ObservableList<String> finance = FXCollections.observableArrayList();
	public Finance() {
		super();
	}
	public Finance(String name, String surname) {
		super(name, surname);
	}
	
	private void addToFinance(EmployeeType type,int month,int year,String monthPostfix) {
		String data = "";
		ArrayList list = new ArrayList();
		switch (type) {
			case CEO: 
				finance.add("CEO: \n");
				list = (ArrayList<CEO>) Main.tps.getCeoList();
				break;
			case EVP: 
				finance.add("EVP: \n");
				list = (ArrayList<EVP>) Main.tps.getEvpList();
				break;
			case Finance: 
				finance.add("FINANCE: \n");
				list = (ArrayList<Finance>) Main.tps.getFinanceList();
				break;
			case GA: 
				finance.add("GA: \n");
				list = (ArrayList<GA>) Main.tps.getGaList();
				break;
			case Sales: 
				finance.add("SALES: \n");
				list = (ArrayList<Sales>) Main.tps.getSalesList();
				break;
			case Engineer: 
				finance.add("OPERATION: \n");
				list = (ArrayList<Operation>) Main.tps.getOperationList();
				break;
			default:
				finance.add("CEO: \n");
				list = (ArrayList<CEO>) Main.tps.getCeoList();
		}
		for(int i=0;i<Main.tps.ceoList.size();i++) {
			boolean check = false;
			Employee employee = (Employee) list.get(i);
 			
 			data += "ID: "+employee.getId()+"\nName: "+employee.getName()+" Surname: "
 					+employee.getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: "; //2018's 1st month payroll
 			for (int ii=0; ii<employee.payrollList.size(); ii++) {
 				if (employee.payrollList.get(ii).getMonth() == month && employee.payrollList.get(ii).getYear() == year) {
 					data += employee.payrollList.get(ii).getTotal()+"\n\n";
 					finance.add(data);
 					data = "";
 					check = true;
 					break;
 				}
 			}
 			if(!check) {
 				data += "-";
 				finance.add(data);
 			}
		}
 			
	}
	
	public ObservableList<String> printAllPayroll(int month, int year) {
	 	String monthPostfix;
	 	if (month == 1) monthPostfix = "st";
	 	else if (month == 2) monthPostfix = "nd";
	 	else if (month == 3) monthPostfix = "rd";
	 	else monthPostfix = "th";
	 	for (EmployeeType type : EmployeeType.values()) {
 			addToFinance(type, month, year, monthPostfix);
 		}
 		
 		return finance;
	}
	
	
	public String toString() {
		String data;
		data = "Finance"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+"NickName : "+this.getNickname()+"\n"+
	            "Birthdate: "+this.getBirthDate()+"\n"+"Age: "+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address : "+this.getAddress()
	            +"\n"+"Starting Date: "+this.getStartingDate().getTime().toString()+"\n";
		return data;
	}
}
