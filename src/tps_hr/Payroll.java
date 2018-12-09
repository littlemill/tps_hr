package tps_hr;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Payroll {
	private int month;
	private int year;
	private int salary;
	private int commission;
	private int total;

	public Payroll(int month,int year,int salary,int commission) {
		setMonth(month);
		setYear(year);
		setSalary(salary);
		setCommission(commission);
		setTotal();
	}
	
	//getter and setter
	public int getTotal() {
		return total;
	}
	
	public void setTotal() {
		this.total = this.getCommission()+this.getSalary();
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month < 1 || month>12) {
			this.month = 0 ;
		}else {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if(salary<0 || salary==0) this.salary = 0;
		else this.salary = salary;
	}
	
	public int getCommission() {
		return commission;
	}
	
	public void setCommission(int commission) {
		this.commission = commission;
	}
	
}
