import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import in.kp.JdbcUtil.*;
/*
 * Local Transaction
 * -----------------
 * transactions happened within same db
 * SUPPORTED BY: JDBC
 * 
 * Global Transaction
 * -------------------
 * transactions happened between db
 * SUPPORTED BY: EJB,Spring Framework
 * 
 */
public class Transaction {
	
	public static void Read()
	{
		//Resources
		Connection conn=null;
		Statement stmt=null;
		ResultSet resultSet=null;
		
try {
		Properties prop=new Properties();
	
		FileInputStream fis=new FileInputStream("Jdbc.properties");
		
		prop.load(fis);
		
		MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
		
	
		ds.setUrl(prop.getProperty("url"));
		ds.setUser(prop.getProperty("uname"));
		ds.setPassword(prop.getProperty("pwd"));
		
		conn=ds.getConnection();
		stmt=conn.createStatement();
		
		resultSet=stmt.executeQuery("select * from college.hdfc;");
		
		if(resultSet!=null)
		{
			System.out.println("Name\tBalance");
			System.out.println("________________");
			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1)+"\t"+resultSet.getInt(2));
			}
		}
	}
	catch(IOException io)
	{
		io.printStackTrace();
	}	catch(SQLException fe)
	{
		fe.printStackTrace();
	
	}
		
	}
	
	

	public static void main(String[] args) throws SQLException,FileNotFoundException,IOException {
	
		//Resources
		Connection conn=null;
		Statement stmt=null;
		ResultSet resultSet=null;
		Scanner sc=new Scanner(System.in);
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("Jdbc.properties");
		
		prop.load(fis);
		
		MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
		
	
		ds.setUrl(prop.getProperty("url"));
		ds.setUser(prop.getProperty("uname"));
		ds.setPassword(prop.getProperty("pwd"));
		
		conn=ds.getConnection();
		
		if(conn!=null)
		{
			stmt=conn.createStatement();
			System.out.println("Date before transaction::");
			System.out.println("--------------------------");
			
			Read();
			//setting auto commit false
			conn.setAutoCommit(false);
			
			System.out.println("Transaction begins.............");
			System.out.println("enter amount to transfer:");
			int val=sc.nextInt();
			
			Savepoint sp=conn.setSavepoint();
			stmt.executeUpdate("update college.hdfc set Balance=Balance-"+val+" where Name='Sachin';");
			stmt.executeUpdate("update college.hdfc set Balance=Balance+"+val+" where Name='Dhoni';");

			System.out.println("Do you want to commit transaction: [yes/no]");
			String opinion=sc.next();
			if(opinion.equalsIgnoreCase("yes"))
				conn.commit();
			else
				conn.rollback();
			
			
			System.out.println("Date after updating transaction::");
			System.out.println("--------------------------");

			Read();
			
			
		}
		
		
	}

}
