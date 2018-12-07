package tps_hr;

import fxml.newMain;
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
	
	public ObservableList<String> printAllPayroll(int month, int year) {
		String data = "";
		String monthPostfix;
		if (month == 1) monthPostfix = "st";
		else if (month == 2) monthPostfix = "nd";
		else if (month == 3) monthPostfix = "rd";
		else monthPostfix = "th";
		
		finance.add("CEO:");
		for (int i=0; i<newMain.tps.ceoList.size(); i++) {
			boolean check = false;
			data += "ID: "+newMain.tps.ceoList.get(i).getId()+"\nName: "+newMain.tps.ceoList.get(i).getName()+" Surname: "
					+newMain.tps.ceoList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: "; //2018's 1st month payroll
			for (int ii=0; ii<newMain.tps.ceoList.get(i).payrollList.size(); ii++) {
				if (newMain.tps.ceoList.get(i).payrollList.get(ii).getMonth() == month && newMain.tps.ceoList.get(i).payrollList.get(ii).getYear() == year) {
					data += newMain.tps.ceoList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					finance.add(data);
					data = "";
					check = true;
					break;
				}
			}
			if(!check) {
				data += "-";
				finance.add(data);
				data = "";
				
			}
		}
		finance.add("EVP:");
		for (int i=0; i<newMain.tps.evpList.size(); i++) {
			boolean check = false;
			data += "ID: "+newMain.tps.evpList.get(i).getId()+"\nName: "+newMain.tps.evpList.get(i).getName()+" Surname: "
					+newMain.tps.evpList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: "; //2018's 1st month payroll
			for (int ii=0; ii<newMain.tps.evpList.get(i).payrollList.size(); ii++) {
				if (newMain.tps.evpList.get(i).payrollList.get(ii).getMonth() == month && newMain.tps.evpList.get(i).payrollList.get(ii).getYear() == year) {
					data += newMain.tps.evpList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					finance.add(data);
					data = "";
					break;
				}
			}
			if(!check) {
				data += "-";
				finance.add(data);
				data = "";
				
			}
		}
		finance.add("OPERATION:");
		for (int i=0; i<newMain.tps.operationList.size(); i++) {
			boolean check = false;
			data += "ID: "+newMain.tps.operationList.get(i).getId()+"\nName: "+newMain.tps.operationList.get(i).getName()+" Surname: "
					+newMain.tps.operationList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<newMain.tps.operationList.get(i).payrollList.size(); ii++) {
				if (newMain.tps.operationList.get(i).payrollList.get(ii).getMonth() == month && newMain.tps.operationList.get(i).payrollList.get(ii).getYear() == year) {
					data += newMain.tps.operationList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					finance.add(data);
					data = "";
					break;
				}
			}
			if(!check) {
				data += "-";
				finance.add(data);
				data = "";
				
			}
		}
		
		finance.add("SALES:");
		for (int i=0; i<newMain.tps.salesList.size(); i++) {
			boolean check = false;
			data += "ID: "+newMain.tps.salesList.get(i).getId()+"\nName: "+newMain.tps.salesList.get(i).getName()+" Surname: "
					+newMain.tps.salesList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<newMain.tps.salesList.get(i).payrollList.size(); ii++) {
				if (newMain.tps.salesList.get(i).payrollList.get(ii).getMonth() == month && newMain.tps.salesList.get(i).payrollList.get(ii).getYear() == year) {
					data += newMain.tps.salesList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					finance.add(data);
					data = "";
					break;
				}
			}
			if(!check) {
				data += "-";
				finance.add(data);
				data = "";
				
			}
		}
		
		finance.add("GA:");
		for (int i=0; i<newMain.tps.gaList.size(); i++) {
			boolean check = false;
			data += "ID: "+newMain.tps.gaList.get(i).getId()+"\nName: "+newMain.tps.gaList.get(i).getName()+" Surname: "
					+newMain.tps.gaList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<newMain.tps.gaList.get(i).payrollList.size(); ii++) {
				if (newMain.tps.gaList.get(i).payrollList.get(ii).getMonth() == month && newMain.tps.gaList.get(i).payrollList.get(ii).getYear() == year) {
					data += newMain.tps.gaList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					finance.add(data);
					data = "";
					break;
				}
			}
			if(!check) {
				data += "-";
				finance.add(data);
				data = "";
				
			}
		}
		
		finance.add("FINANCE:");
		for (int i=0; i<newMain.tps.financeList.size(); i++) {
			boolean check = false;
			data += "ID: "+newMain.tps.financeList.get(i).getId()+"\nName: "+newMain.tps.financeList.get(i).getName()+" Surname: "
					+newMain.tps.financeList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
			for (int ii=0; ii<newMain.tps.financeList.get(i).payrollList.size(); ii++) {
				if (newMain.tps.financeList.get(i).payrollList.get(ii).getMonth() == month && newMain.tps.financeList.get(i).payrollList.get(ii).getYear() == year) {
					data += newMain.tps.financeList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
					finance.add(data);
					data = "";
					break;
				}
			}
			if(!check) {
				data += "-";
				finance.add(data);
				data = "";
				
			}
		}
		return finance;
	}
	
	public String toString() {
		return "FINANCE"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
