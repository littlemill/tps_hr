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
//		finance.add("EVP:");
//		for (int i=0; i<evpList.size(); i++) {
//			boolean check = false;
//			data += "ID: "+evpList.get(i).getId()+"\nName: "+evpList.get(i).getName()+" Surname: "
//					+evpList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: "; //2018's 1st month payroll
//			for (int ii=0; ii<evpList.get(i).payrollList.size(); ii++) {
//				if (evpList.get(i).payrollList.get(ii).getMonth() == month && evpList.get(i).payrollList.get(ii).getYear() == year) {
//					data += evpList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
//					finance.add(data);
//					data = "";
//					break;
//				}
//			}
//			if(!check) {
//				data += "-";
//				finance.add(data);
//				data = "";
//				
//			}
//		}
//		finance.add("OPERATION:");
//		for (int i=0; i<operationList.size(); i++) {
//			boolean check = false;
//			data += "ID: "+operationList.get(i).getId()+"\nName: "+operationList.get(i).getName()+" Surname: "
//					+operationList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
//			for (int ii=0; ii<operationList.get(i).payrollList.size(); ii++) {
//				if (operationList.get(i).payrollList.get(ii).getMonth() == month && operationList.get(i).payrollList.get(ii).getYear() == year) {
//					data += operationList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
//					finance.add(data);
//					data = "";
//					break;
//				}
//			}
//			if(!check) {
//				data += "-";
//				finance.add(data);
//				data = "";
//				
//			}
//		}
//		
//		finance.add("SALES:");
//		for (int i=0; i<salesList.size(); i++) {
//			boolean check = false;
//			data += "ID: "+salesList.get(i).getId()+"\nName: "+salesList.get(i).getName()+" Surname: "
//					+salesList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
//			for (int ii=0; ii<salesList.get(i).payrollList.size(); ii++) {
//				if (salesList.get(i).payrollList.get(ii).getMonth() == month && salesList.get(i).payrollList.get(ii).getYear() == year) {
//					data += salesList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
//					finance.add(data);
//					data = "";
//					break;
//				}
//			}
//			if(!check) {
//				data += "-";
//				finance.add(data);
//				data = "";
//				
//			}
//		}
//		
//		finance.add("GA:");
//		for (int i=0; i<gaList.size(); i++) {
//			boolean check = false;
//			data += "ID: "+gaList.get(i).getId()+"\nName: "+gaList.get(i).getName()+" Surname: "
//					+gaList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
//			for (int ii=0; ii<gaList.get(i).payrollList.size(); ii++) {
//				if (gaList.get(i).payrollList.get(ii).getMonth() == month && gaList.get(i).payrollList.get(ii).getYear() == year) {
//					data += gaList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
//					finance.add(data);
//					data = "";
//					break;
//				}
//			}
//			if(!check) {
//				data += "-";
//				finance.add(data);
//				data = "";
//				
//			}
//		}
//		
//		finance.add("FINANCE:");
//		for (int i=0; i<financeList.size(); i++) {
//			boolean check = false;
//			data += "ID: "+financeList.get(i).getId()+"\nName: "+financeList.get(i).getName()+" Surname: "
//					+financeList.get(i).getSurname()+"\n"+year+"'s "+month+monthPostfix+" month payroll: ";
//			for (int ii=0; ii<financeList.get(i).payrollList.size(); ii++) {
//				if (financeList.get(i).payrollList.get(ii).getMonth() == month && financeList.get(i).payrollList.get(ii).getYear() == year) {
//					data += financeList.get(i).payrollList.get(ii).calculatePayroll()+"\n\n";
//					finance.add(data);
//					data = "";
//					break;
//				}
//			}
//			if(!check) {
//				data += "-";
//				finance.add(data);
//				data = "";
//				
//			}
//		}
		return finance;
	}
	
	public String toString() {
		return "FINANCE"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
