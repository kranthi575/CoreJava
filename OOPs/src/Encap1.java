
public class Encap1 {
	
	private int id;
	
	static int a=10;
	
	private String uname;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUname(String name) {
		this.uname=name;
	}
	
	public String getUname() {
		return uname;
	}
	
	public Encap1(int i,int j) {
		
		System.out.println("Param constructor"+i+" "+j);
		
	}
	
	static{
		
		System.out.println("static block"+a);
	}
	
	{
		
		System.out.println("Non-static block"+a);
	}
	public Encap1() {
		this(10,20);
		System.out.println("Non-param constructor");
	}
	
	public Encap1(int id,String uname) {
		this();
		this.id=id;
		this.uname=uname;
		
	}

	public static void main(String[] args) {
		
		System.out.println("this is main method:");
		
		Encap1 obj=new Encap1(10,"kranthi");
		
		//obj.setId(19);		
		System.out.println(obj.getId());
		
//		obj.setUname("sachin");
		System.out.println(obj.getUname());
		
		
		
		
	}

}
