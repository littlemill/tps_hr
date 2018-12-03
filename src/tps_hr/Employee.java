package tps_hr;

import java.util.*;

public abstract class Employee implements HolidayEntitlement {
	protected String id, password;
	protected String name,surname,nickname,tel,address,status;
	protected int age, salary;
	protected Date birthDate, startingDate, resignationDate;
	protected Certificate[] CertificateList;
	protected Payroll[] PayrollList;
	protected TimeSheet[] timeSheetList;
	protected int workYears, maxHolidays, usedHolidays; // calculating holiday entitlement
	
	
	public Employee() {
		setName("");
		setSurname("");
		setNickname("");
		setBirthdate("");
		setTel("");
		setAddress("");
		setId("");
		setStatus("single");
		setAge(0);
		setStartingdate("");
		setResignationdate("-");
	}

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


	public Date getStartingDate() {
		return startingDate;
	}


	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}


	public Date getResignationDate() {
		return resignationDate;
	}


	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}


	public String getStartingdate() {
		return startingdate;
	}


	public void setStartingdate(String startingdate) {
		this.startingdate = startingdate;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public String getResignationdate() {
		return resignationdate;
	}


	public void setResignationdate(String resignationdate) {
		this.resignationdate = resignationdate;
	}


	public Certificate[] getCertificateList() {
		return CertificateList;
	}


	public void setCertificateList(Certificate[] certificateList) {
		CertificateList = certificateList;
	}


	public Payroll[] getPayrollList() {
		return PayrollList;
	}


	public void setPayrollList(Payroll[] payrollList) {
		PayrollList = payrollList;
	}


	public TimeSheet[] getTimeSheetList() {
		return timeSheetList;
	}


	public void setTimeSheetList(TimeSheet[] timeSheetList) {
		this.timeSheetList = timeSheetList;
	}

	
}
