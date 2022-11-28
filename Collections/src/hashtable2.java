import java.util.*;

public class hashtable2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Hashtable hm=new Hashtable();
		
		hm.put(new Temp(1),"A");
		
		hm.put(new Temp(2),"B");
		
		hm.put(new Temp(3),"C");
		
		hm.put(new Temp(4),"D");
		
		hm.put(new Temp(5),"E");
		
		hm.put(new Temp(6),"F");
		
		hm.put(new Temp(7),"G");
		
		hm.put(new Temp(8),"H");
		
		hm.put(new Temp(9),"I");
		
		hm.put(new Temp(10),"J");
		
		
		//hashcode%capacity=key
		System.out.println(hm);
		
		
		

	}

}

class Temp{
	
	
	int i;
	
	public Temp(int i) {
		this.i=i;
	}
	
	@Override
	public int hashcode(){
		return i;
		
	}
	@Override
	public String toString()
	{
		return i+" ";
	}	
}
