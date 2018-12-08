package tps_hr;

import javafx.beans.property.SimpleStringProperty;

public class Payroll {
	private int month;
	private int year;
	private int salary;
	private int commission;
	private String Month;
	private String Year;
	private String Salary;
	private String Commission;
	private String Total;
	/*private SimpleStringProperty Month;
	private SimpleStringProperty Year;
	private SimpleStringProperty Salary;
	private SimpleStringProperty Commission;
	private SimpleStringProperty Total;*/
	
	public Payroll(int month,int year,int salary,int commission) {
		setMonth(month);
		setYear(year);
		setSalary(salary);
		setCommission(commission);
		calculatePayroll();
	}
	public int calculatePayroll() {
		this.Total = Integer.toString(this.getSalary()+this.getCommission());
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
		this.Month = Integer.toString(this.month);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		this.Year = Integer.toString(this.year);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<0 || salary==0) this.salary = 0;
		else this.salary = salary;
		this.Salary = Integer.toString(this.salary);
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
		this.Commission = Integer.toString(this.commission);
	}
	
}
