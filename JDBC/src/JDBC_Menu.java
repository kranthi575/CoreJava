import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Question1
Give the menu to the user as the operation listed below on student table
1. Create 2. Read 3. Update 4. Delete
 */


public class JDBC_Menu 
{
	public static void Create() throws SQLException{
		
				System.out.println("Please enter student details to create:\n");
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter Student ID:");
				int sId=sc.nextInt();
				
				System.out.println("Enter Student Name:");
				String sName=sc.next();
				
				System.out.println("Enter Student Age");
				int sAge=sc.nextInt();
				
				System.out.println("Enter Student Address:");
				String sAddr=sc.next();
				
				//Resources
				Connection connection=null;
				Statement statement=null;
				ResultSet resultSet=null;
				
				String url="jdbc:mysql://127.0.0.1:3306/?user=root";
				String username="root";
				String password="root";
				try 
				{
					connection=DriverManager.getConnection(url,username,password);
					
					if(connection!=null)
					{
						statement = connection.createStatement();
						
						if(statement!=null)
						{
						//INSERT INTO enterprisejava.student (SID, SNAME, SAGE, SADDR) VALUES ();
						String sqlQuery = String.format("INSERT INTO enterprisejava.student (SID, SNAME, SAGE, SADDR) VALUES ( %d,'%s')");
						
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
					//closing resources
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
				}
	}
	
	public static void Update() {}
	public static void Read() throws SQLException {
		//Resources
				Connection connection=null;
				Statement statement=null;
				ResultSet resultSet=null;
				
				String url="jdbc:mysql://127.0.0.1:3306/?user=root";
				String username="root";
				String password="root";
				try 
				{
					connection=DriverManager.getConnection(url,username,password);
					
					if(connection!=null)
					{
						statement = connection.createStatement();
						
						if(statement!=null)
						{
						
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
					//closing resources
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
				}
	}
	public static void Delete() {}
	
	public static void main(String[] args) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("User Please select one Opeartion:\n1.CREATE\n2.UPDATE\n3.READ\n4.DELETE");
		int op=sc.nextInt();
		switch(op) {
		
		case 1:Create();
				break;
		case 2:Update();
				break;
		case 3:Read();
				break;
		case 4:Delete();
				break;
		default:
			System.out.println("Please select valid  option");
		}

	}

}
