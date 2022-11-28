class Producer1 extends Thread{
	
	//Producer producing the data in StringBuffer
	StringBuffer sb;
	//variable user by dataProvider for communication
	boolean dataProvider=false;
	
	int total;
	
	public Producer1() {
		//StringBuffer object will be created
		sb=new StringBuffer();
	}
	@Override
	public void run()
	{
			synchronized(this)
			{	
					try
					{
						
						Thread.sleep(2000);
						for(int i=1;i<=100;i++) {
							total=total+i;
						}
					}
					catch(InterruptedException ie)
					{
						ie.printStackTrace();
					}
				
					//informing consumer data is available
					dataProvider=true;
			}
	}
	
	public boolean getDataProvider()
	{
		return dataProvider;
	}
	
}
class Consumer1 extends Thread{
	
	//Creating Producer object to get the produced data from string buffer
	Producer1 producer;
	public Consumer1(){
		Producer1 producer;
	}
	@Override
	public void run() 
	{
	
		synchronized(producer)
		{
			System.out.println("Consumer is calling wait method:");
			try {
			producer.wait();
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.println(producer.sb);
			
		}
	}
}
class Communication1{
	public void init() {
	Producer1 producer=new Producer1();
	Consumer1 consumer=new Consumer1();
	
	producer.start();
	consumer.start();
	}
}


public class InterCommunicationTh3 {

	public static void main(String[] args) {
		Communication c=new Communication();
		c.init();

	}

}
