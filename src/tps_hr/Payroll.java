package tps_hr;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Payroll {
	private int month;
	private int year;
	private int salary;
	private int commission;

	private StringProperty monthProp;
	private StringProperty yearProp;
	private StringProperty salaryProp;
	private StringProperty commissionProp;
	private StringProperty totalProp;
	
	public Payroll(int month,int year,int salary,int commission) {
		setMonth(month);
		setYear(year);
		setSalary(salary);
		setCommission(commission);
		calculatePayroll();
	}
	public int calculatePayroll() {
		totalProp().setValue(Integer.toString(this.getSalary()+this.getCommission()));
		return this.getSalary()+this.getCommission();
	}
	//getter and setter
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month>12) {
			this.month = 0 ;
		}else {
			this.month = month;
		}
		monthProp().set(Integer.toString(this.month));
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		yearProp().set(Integer.toString(this.year));
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<0 || salary==0) this.salary = 0;
		else this.salary = salary;
		salaryProp().set(Integer.toString(this.salary));
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
		commissionProp().set(Integer.toString(this.commission));
	}
	public String getMonthProp() {
		return monthProp().get();
	}
	
	public String getYearProp() {
		return yearProp().get();
	}
	
	public String getSalaryProp() {
		return salaryProp().get();
	}
	
	public String getCommissionProp() {
		return commissionProp().get();
	}
	
	public String getTotalProp() {
		return totalProp().get();
	}
	
	//String Property
	public StringProperty monthProp() {
		if (monthProp == null) monthProp = new SimpleStringProperty(this,"Month");
		return monthProp;
	}
	public StringProperty yearProp() {
		if (yearProp == null) yearProp = new SimpleStringProperty(this,"Year");
		return yearProp;
	}
	public StringProperty salaryProp() {
		if (salaryProp == null) salaryProp = new SimpleStringProperty(this,"Salary");
		return salaryProp;
	}
	public StringProperty commissionProp() {
		if (commissionProp == null) commissionProp = new SimpleStringProperty(this,"Commission");
		return commissionProp;
	}
	public StringProperty totalProp() {
		if (totalProp == null) totalProp = new SimpleStringProperty(this,"Month");
		return totalProp;
	}
}
