package tps_hr;

import java.util.Date;

public interface HolidayEntitlement {
	
	
	public int calculateHolidayEntitlement(int maxHolidays, int usedHolidays);
	public int decreseHolidays(Date date1, Date date2); //absent for more than 1 day
	public void reset();
	public int getWorkYears();
	public void setWorkYears();
	public int getmaxHolidays();
	public void setMaxHolidays();
	public int getUsedHolidays();
	public void setUsedHolidays();
}