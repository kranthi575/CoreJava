import java.time.Period;
import java.time.LocalDate;

public class CalcAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate today=LocalDate.now();
		
		LocalDate bday = LocalDate.of(1999, 3, 10);
		
		Period p = Period.between(today, bday);
		
		System.out.println(p);
	}

}
