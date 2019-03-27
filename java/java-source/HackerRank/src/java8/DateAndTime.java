package java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {

	public static void main(String[] args) {
		System.out.println(findDay(3,24,2019));
	}

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		//Calendar cal = new GregorianCalendar(year, month, day);
		Calendar cal = Calendar.getInstance(); 
		cal.set(year, month, day);
		int dayIs = cal.get(Calendar.DAY_OF_WEEK);
		String array[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		
		return array[dayIs-1];
	}

}
