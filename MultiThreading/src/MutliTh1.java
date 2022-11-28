
public class MutliTh1 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello Focus here");
		
		Thread th=Thread.currentThread();
		//thread name : main,priority (default): 5, stack
		
		System.out.println(th);//main,5,main
		
		th.setName("thread1");
		th.setPriority(4);
		
		System.out.println(th);//thread1,4,main
		
	}

}
