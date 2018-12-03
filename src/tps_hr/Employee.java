package tps_hr;

import java.util.*;

public class Employee {
	protected String user;
	protected String password;
	protected String name,surname,nickname,tel,address,id,status;
	protected int age;
	protected String startingdate,birthdate,resignationdate; //"date/month/year" and "-" if haven't resigned yet.
	protected Certificate[] CertificateList;
	protected Payroll[] PayrollList;
	protected int holidayEntitlement;
	protected int workingYear ;
	
	
	public Employee(String name,String surname) {
		setName(name);
		setSurname(surname);
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
	
	//getter and setter
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	public String getStartingdate() {
		return startingdate;
	}

	public void setStartingdate(String startingdate) {
		this.startingdate = startingdate;
	}

	public String getResignationdate() {
		return resignationdate;
	}

	public void setResignationdate(String resignationdate) {
		this.resignationdate = resignationdate;
	}

	public int getHolidayEntitlement() {
		return holidayEntitlement;
	}

	/*public void updateHolidayEntitlement() {
		if()
	}*/
}
