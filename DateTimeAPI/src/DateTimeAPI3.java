import java.time.*;

public class DateTimeAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);//2022-11-27T10:41:49.729060600
		
		System.out.println();
		
		LocalDateTime dt2 = LocalDateTime.of(1999,3,10,12,13,20);
		System.out.println(dt2);
		
		System.out.println(dt2.plusMonths(6));
		System.out.println(dt2.plusMinutes(60));
	}

}
