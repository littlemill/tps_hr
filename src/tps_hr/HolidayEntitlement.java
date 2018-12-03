package tps_hr;

import java.util.Date;

public interface HolidayEntitlement {
	
	
	public int calculateHolidayEntitlement(int maxHolidays, int usedHolidays);
	public int decreseHolidays(Date date1, Date date2); //absent for more than 1 day
	public void reset();
	public void getWorkYears();
	public int setWorkYears();
	public void getmaxHolidays();
	public int setMaxHolidays();
	public void getUsedHolidays();
	public int setUsedHolidays();
}