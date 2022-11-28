import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda4 {

	public static void main(String[] args) {
		
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,5);
		
		
		for(int e:numbers) {
			
			
			System.out.println("value:"+e);
		}
		//lamda expressions
		numbers.forEach(value->System.out.println(value));
		
	}

}
