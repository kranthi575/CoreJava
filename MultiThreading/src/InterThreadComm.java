

/*Interaction between two threads
 
Producer - Consumer ProblemStatement

Producer:
	->producer produces the data and once the data is produced,
	update the consumer saying data is available
Consumer:
	->Consumer consumes the data produced by the Producer other wise in sleep data
	and check data is available from producer end.
*/
class Producer extends Thread{
	
	//Producer producing the data in StringBuffer
	StringBuffer sb;
	//variable user by dataProvider for communication
	boolean dataProvider=false;
	
	public Producer() {
		//StringBuffer object will be created
		sb=new StringBuffer();
	}
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++) {
			
			try
			{
				sb.append(i+":");
				Thread.sleep(2000);
				System.out.println("appending.....");
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		//informing consumer data is available
		dataProvider=true;
		
	}
	
	public boolean getDataProvider() {
		return dataProvider;
	}
	
}
class Consumer extends Thread{
	
	//Creating Producer object to get the produced data from string buffer
	Producer producer;
	public Consumer(){
		Producer producer;
	}
	@Override
	public void run()
	{
		while(producer.dataProvider==false) {
			try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}		
	}
		try {
	System.out.println(producer.sb);}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
}
}
class Communication{
	public void init() {
	Producer producer=new Producer();
	Consumer consumer=new Consumer();
	
	producer.start();
	consumer.start();
	}
}

public class InterThreadComm{
	

	public static void main(String[] args){
		
		Communication c=new Communication();
		c.init();
		
		}
}
