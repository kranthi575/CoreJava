
import java.util.*;

public class Gen1 {

	public static void main(String[] args) {
		
		//Generic syntax
		ArrayList<String> al=new ArrayList<String>();
		
		List<String> list=new ArrayList<String>();
		
		Collection<String> c=new ArrayList<String>();
		
		/*
		 * Invalid syntax
		 * 
		 * Object types cannot be converted
		 *  
		 */
		//List<Object> list2=new ArrayList<String>();
		
		
		/*
		 * class ArrayList{
		 * 
		 * 			add(Object o);
		 * 	Object get(int index);
		 * 
		 * }
		 * 
		 */
		ArrayList al3=new ArrayList();//jdk 1.4v
		
		/*
		 * class ArrayList<T>{
		 * 
		 * 			add(T o);
		 * 	T get(int index);
		 * 
		 * }
		 * 
		 */
		
		/*class ArrayList<Integer>{
		 * 
		 * 		add(Integer integer);
		 * 		Integer get(int index);
		 * }
		 */
		ArrayList<Integer> al2=new ArrayList<Integer>();//jdk 1.5
		
		
		
		
		

	}

}
