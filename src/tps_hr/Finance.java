package tps_hr;

public class Finance extends Employee {
	public Finance(String name, String surname) {
		super(name, surname);
	}
	
	public String printAllPayroll(int month, int year) {
		String data = "";
		data += "EVP: \n";
		
		for (int i=0; i<evpList.size(); i++) {
			data += "ID: "+evpList.get(i).getId()+"\nName: "+evpList.get(i).getName()+" Surname: "
					+evpList.get(i).getSurname()+"\nThis month's payroll: ";
			for (int ii=0; ii<evpList.get(i).payrollList.size(); ii++) {
				if (payrollList.get(ii).getMonth() == month && payrollList.get(ii).getYear() == year) {
					data += payrollList.get(ii).calculatePayroll()+"\n\n";
					break;
				}
			}
		}
		
		return data;
	}
	
	public String toString() {
		return "FINANCE"+"\n"+"Name: "+this.getName()+" Surname: "+this.getSurname()+"\n"+
	            "Birthdate: "+this.getBirthDate().toString()+" Age:"+this.getAge()+" Tel: "+this.getTel()+"\n"+"Address :"+this.getAddress();
	}
}
