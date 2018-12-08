package tps_hr;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class HolidayEntitlement {
	private int maxHolidays , usedHolidays;
	
	public HolidayEntitlement() {
		setMaxHolidays(1);
		reset();
	}
	public int calculateHolidayEntitlement(int maxHolidays, int usedHolidays) {
		return maxHolidays-usedHolidays;
	}	
	public long decreaseHolidays(Date date1, Date date2) {
		long diff = date2.getTime() - date1.getTime();
		long time = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		int t = (int) time;
		this.setUsedHolidays(this.getUsedHolidays()+t);
		return time;
	}//absent for more than 1 day
	public void reset() {
		this.setUsedHolidays(0);
	}
	public int getmaxHolidays() {
		return this.maxHolidays;
	}
	public void setMaxHolidays(int workyear) {
		if(workyear >= 0 && workyear < 3) {
			this.maxHolidays = 3;
		}
		if(workyear >= 3 && workyear < 5) {
			this.maxHolidays = 6;
		}
		if(workyear>5) {
			this.maxHolidays = 8;
		}
	}
	public int getUsedHolidays() {
		return usedHolidays;
	}

	public void setUsedHolidays(int usedHolidays) {
		this.usedHolidays = usedHolidays;
	}
}
