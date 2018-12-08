package tps_hr;


import java.util.*;

import fxml.Main;

public abstract class Employee {
	
	protected EmployeeType type;
	protected String id, password;
	protected String name,surname,nickname,tel,address;
	protected int age, salary;
	protected String birthDate;
	protected Calendar startingDate, resignationDate;
	protected ArrayList<Payroll> payrollList;
	protected ArrayList<TimeSheet> timeSheetList;
	protected int workYears; // calculating holiday entitlement
	protected boolean hasResigned;
	protected HolidayEntitlement holiday;
	
	public Employee() {
		setId("");
		setPassword("");
		setName("");
		setSurname("");
		setNickname("");		
		setTel("");
		setAddress("");
		setAge(0);
		setSalary(0);
		payrollList = new ArrayList<Payroll>();
		timeSheetList = new ArrayList<TimeSheet>();
		holiday = new HolidayEntitlement();
	}
	
	public Employee(String name,String surname) {
		setId("");
		setPassword("");
		setName(name);
		setSurname(surname);
		setNickname("");		
		setTel("");
		setAddress("");
		setAge(0);
		setSalary(0);
		payrollList = new ArrayList<Payroll>();
		timeSheetList = new ArrayList<TimeSheet>();
		holiday = new HolidayEntitlement();
	}
	
	
	public void resign() {
		this.setHasResigned(true);
		this.setResignationDate();
		Main.tps.resignedEmployee.add(this);
	}
	public abstract String toString(); 

	public void calculateWorkYears () {
		Calendar rightnow = Calendar.getInstance();
		rightnow.compareTo(startingDate);
	}
		
	public void promote(int newSalary) {
		this.setSalary(newSalary);
	}

	//getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int year,int month,int date) {
		String yearS,monthS,dateS;
		yearS = Integer.toString(year);
		monthS = Integer.toString(month);
		dateS = Integer.toString(date);
		this.birthDate = dateS+"/"+monthS+"/"+yearS;
	}

	public Calendar getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate() {
		Calendar rd = Calendar.getInstance();
		this.resignationDate = rd;
	}

	public int getWorkYears() {
		return workYears;
	}

	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}

	public boolean isHasResigned() {
		return hasResigned;
	}

	public void setHasResigned(boolean hasResigned) {
		this.hasResigned = hasResigned;
	}

	public Calendar getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(int year,int month,int date) {
		Calendar rd = Calendar.getInstance();
		rd.set(year,month,date);
		this.startingDate = rd;
	}

	public HolidayEntitlement getHoliday() {
		return holiday;
	}

	public void setHoliday(HolidayEntitlement holiday) {
		this.holiday = holiday;
	}

	public ArrayList<Payroll> getPayrollList() {
		return payrollList;
	}

	public void setPayrollList(ArrayList<Payroll> payrollList) {
		this.payrollList = payrollList;
	}

	public ArrayList<TimeSheet> getTimeSheetList() {
		return timeSheetList;
	}

	public void setTimeSheetList(ArrayList<TimeSheet> timeSheetList) {
		this.timeSheetList = timeSheetList;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}
}
