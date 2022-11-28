package calculator;

public class Home {

	public static void main(String[] args) {

		
		

		
		AkashCalci obj2=new MaheshCalci();
		
		int res=((MaheshCalci)obj2).sub(2, 1); //undercasting
		
		System.out.println(res);
		
	}

}
