import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.*;

class Menu{
	
	static int x;int sId=0;
	static Scanner sc=new Scanner(System.in);
	static Connection connection=null;
	static Statement statement=null;
	static ResultSet resultSet=null;
	public void Resources()
	{
		
		String url="jdbc:mysql://127.0.0.1:3306/?user=root";
		String username="root";
		String password="root";
		try {
		connection=DriverManager.getConnection(url,username,password);
		
		if(connection!=null)
		{
			statement = connection.createStatement();
			
			System.out.println("Resources allocated");

		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void Create() throws SQLException
	{
		Resources();
		
		System.out.println("scannner"+sc.hashCode());
		 int sId=0;
		// Scanner scc=new Scanner(System.in);
		String sName=null;
		int sAge=0;
		String sAddr=null;
		try {
		System.out.println("Please enter student details to create:\n");
		
		System.out.println("Enter Student ID:");
		System.out.println("test"+sId);
		
		sId=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		sName=sc.next();
		
		System.out.println("Enter Student Age");
		sAge=sc.nextInt();
		
		System.out.println("Enter Student Address:");
		sAddr=sc.next();
		
		String sqlQuery1 = String.format("INSERT INTO enterprisejava.student (SID, SNAME, SAGE, SADDR) VALUES ( %d,'%s',%d,'%s')",sId,sName,sAge,sAddr);
		
		statement.executeUpdate(sqlQuery1);
		
		System.out.println("Row createded succesfully!");
		
		Read();

		}
		catch(InputMismatchException ime)
		{
			System.out.println("Please enter valid input");
			//Create();
		}
		catch(SQLException se){
			
			System.out.println("Please enter valid syntax");
			Create();
		
		
		}
		
		//System.out.println("Create::"+x);
	}
	public void Update() throws SQLException
	{
		System.out.println("scanner :: "+sc);
		Resources();
		try {
		System.out.println("Please Enter SID:");
		int sid=sc.nextInt();
		String header1=null;
		String input1=null;
		String sqlQuery=null;
		System.out.print("User Please select value to update:\n1.SNAME\n2.SAGE\n3.SADDR");
		int op=sc.nextInt();
		switch(op) {
		
		case 1:header1="SNAME";
				input1=sc.next();
				break;
		case 2:header1="SAGE";
		       input1=sc.next();
				break;
		case 3:header1="SADDR";
				input1=sc.next();
				break;
		default:
			System.out.println("Please select valid  option");
		}
		
	if(op==2) {
		 sqlQuery = "UPDATE enterprisejava.student set "+header1+"=\""+Integer.parseInt(input1)+"\" where SID ="+sid+";";
	}else {
		sqlQuery = "UPDATE enterprisejava.student set "+header1+"=\""+input1+"\" where SID ="+sid+";";	
	}
	statement.executeUpdate(sqlQuery);
	System.out.println("Row Updated successfully!!");
	Read();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Please enter valid input::");
			Update();
		}
		catch(SQLException se){
			
		System.out.println("Please enter valid syntax");
		Update();
		}

	
		//System.out.println("update::");
	}
	
	public void Read() throws SQLException
	{
		Resources();
		try {
		String sqlQuery = "select SID,SNAME,SAGE,SADDR from  enterprisejava.student";
		
		resultSet = statement.executeQuery(sqlQuery);
		
		if(resultSet!=null)
		{
			System.out.println("SID\tSNAME\tSAGE\tSADDR");
			System.out.println("-----------------------");
			while(resultSet.next())
			{
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				Integer age = resultSet.getInt(3);
				String add = resultSet.getString   (4);
				
				System.out.println(id+"\t"+name+"\t"+age+"\t"+add);
			}

		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			if(resultSet!=null)
			{
				resultSet.close();
			}
			if(statement!=null)
			{
				statement.close();
			}
			if(connection!=null)
			{
				connection.close();
			}
			System.out.println("Resourses closed");
		}
	}
	
	public void Delete() throws SQLException{
		Resources();
		String header1=null;
		String input1=null;
		System.out.print("User, Please select condition :\n1.SNAME\n2.SAGE\n3.SADDR");
		int op=sc.nextInt();
		switch(op) {
		
		case 1:header1="SNAME";
				input1=sc.next();
				break;
		case 2:header1="SAGE";
		       //input1=sc.nextInt();
				break;
		case 3:header1="SADDR";
				input1=sc.next();
				break;
		default:
			System.out.println("Please select valid  option");
		}
		
	
	String sqlQuery = "DELETE FROM enterprisejava.student WHERE "+header1+"=\""+input1+"\";";
	
	System.out.println(sqlQuery);
	
	statement.executeUpdate(sqlQuery);
	System.out.println("Row deleted successfully!!");
	
	Read();
	}
}
public class JDBC4 {

	public static void main(String[] args) throws SQLException{
		
		Scanner sc=new Scanner(System.in);
		Menu menu=new Menu();
		String check=null;
		
		do {
			System.out.print("User Please select one Opeartion:\n1.CREATE\n2.UPDATE\n3.READ\n4.DELETE");
			int op=sc.nextInt();
			switch(op) {
			
			case 1:menu.Create();
			System.out.println("Do you want to continue: y/n");
			check=sc.next();
					break;
			case 2:menu.Update();
			System.out.println("Do you want to continue: y/n");
			check=sc.next();
					break;
			case 3:menu.Read();
			System.out.println("Do you want to continue: y/n");
			check=sc.next();
					break;
			case 4:menu.Delete();
			System.out.println("Do you want to continue: y/n");
			check=sc.next();
					break;
			default:
				System.out.println("Please select valid  option");
				System.out.println("Do you want to continue: y/n");
				check=sc.next();
			}
		}
		while(check.equals("y"));
		
		System.out.println("You'r exited from the applictaion. Please reexecute to continuoue ");
		
	}

}
