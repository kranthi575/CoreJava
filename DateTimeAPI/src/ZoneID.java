import java.time.*;

public class ZoneID {

	public static void main(String[] args) {
		
		ZoneId zone=ZoneId.systemDefault();
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
		System.out.println(zone);
		System.out.println(zt);
		
		ZoneId za = ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime  zt1 = ZonedDateTime.now(za);
		
		System.out.println(zt1);
		
		
		
	}

}
