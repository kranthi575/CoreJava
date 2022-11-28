/*
Date and Time API: (Joda-Time API)
Until Java 1.7 version the classes present in Java.util package to handle Date and
Time (like Date, Calendar,
TimeZone etc) are not up to the mark with respect to convenience and performance.
To overcome this problem in the 1.8 version oracle people introduced Joda-Time API.
This API developed by joda.org and available in Java in the form of "java.time"
package.
*/

import java.time.*;

public class DateTimeApi2 
{

	public static void main(String[] args) 
	{
		LocalDate date =LocalDate.now();
		System.out.println(date);//2022-11-27
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd+":"+mm+":"+yy);
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);//10:26:47.371789700
		int hh = time.getHour();
		int min = time.getMinute();
		int ss=time.getSecond();
		int nn=time.getNano();
		
		System.out.println(hh+""+min+""+ss+""+nn);
		
		
	}

}
