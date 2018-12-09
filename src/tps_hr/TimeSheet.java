package tps_hr;

import java.util.Calendar;

public class TimeSheet {
	private Calendar date;
	private String startTime , endTime;
	private String note;
	private Employee user;
	
	public TimeSheet(String startTime ,String endTime , String note,Employee user) {
		setDate (Calendar.getInstance());
		setStartTime(startTime);
		setEndTime(endTime);
		setNote(note);
		setUser(user);
	}
	
	@Override
	public String toString() {
		String data =  "Last Update:"+date.getTime().toString()+"\n"+"Start Time : "+startTime+"\n"+"End Time : "+endTime+"\n"+"Note : ";
		if(this.getNote().equals("")) return data + "-";
		else return data + this.getNote();
	}
	
	//getters and setters
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	public Employee getUser() {
		return user;
	}

	public void setUser(Employee user) {
		this.user = user;
	}

	
}
