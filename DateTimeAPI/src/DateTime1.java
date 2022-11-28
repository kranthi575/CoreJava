
/*
 * Date present in two packages 
import java.util.Date;
::used for general operatoins
import java.sql.Date;
::used for SQL operations

Difference b/w java.util.Date and java.sql.Date
=====================================
java.util.Date
=> It is a utility class to handles Date in our java program.
=> It represents both Date and Time
java.sql.Date
=> It is designed class to handle Dates w.r.t DB operations
=> It represents only Date,but not Time.
*/

public class DateTime1 {

	public static void main(String[] args) 
	{
		java.util.Date utilDate = new java.util.Date();
		
		System.out.println(utilDate); //Sun Nov 27 09:40:56 IST 2022
		
		
		long hours = utilDate.getHours();
		
		System.out.println("Hours:"+hours);
		
		java.sql.Date sqlDate = new java.sql.Date(hours);
		
		System.out.println("sqlDate1:"+sqlDate);//1970-01-01
		
		long milli = utilDate.getTime();
		
		System.out.println("milli"+milli);
		
		java.sql.Date sqlDate2 = new java.sql.Date(milli);
		
		System.out.println("sqlDate2"+sqlDate2);
		
		
	}

}
