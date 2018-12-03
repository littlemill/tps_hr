package tps_hr;

import java.util.*;

public abstract class Employee implements HolidayEntitlement {
	protected String id, password;
	protected String name,surname,nickname,tel,address,status;
	protected int age, salary;
	protected Date birthDate, startingDate, resignationDate;
	protected ArrayList<Certificate> certificateList;
	protected ArrayList<Payroll> payrollList;
	protected ArrayList<TimeSheet> timeSheetList;
	protected int workYears, maxHolidays, usedHolidays; // calculating holiday entitlement
	
	
	public Employee() {
		setId("");
		setName("");
		setSurname("");
		setNickname("");		
		setTel("");
		setAddress("");
		setStatus("single");
		setAge(0);
		setSalary(0);
		/*setBirthdate("");
		setStartingdate("");
		setResignationdate("-"); */
		certificateList = new ArrayList<Certificate>();
		payrollList = new ArrayList<Payroll>();
		timeSheetList = new ArrayList<TimeSheet>();
	}
	
	public abstract String toString(); 

	public int workDays(Date date, Date startingDate) {
			
	}
		
	void promote(int newSalary) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public int getWorkYears() {
		return workYears;
	}

	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}

	public int getMaxHolidays() {
		return maxHolidays;
	}

	public void setMaxHolidays(int maxHolidays) {
		this.maxHolidays = maxHolidays;
	}

	public int getUsedHolidays() {
		return usedHolidays;
	}

	public void setUsedHolidays(int usedHolidays) {
		this.usedHolidays = usedHolidays;
	}
}
