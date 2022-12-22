package in.kp.main;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
/*
 * pool of connection available in datasource object
 * 
 * 
 */

public class ConnectionPoolingApp {

	public static void main(String[] args) throws SQLException{

		//creating a pooled connection object
		MysqlConnectionPoolDataSource datasource=new MysqlConnectionPoolDataSource();
		
		String url="jdbc:mysql://localhost:3306/?user=root";
		String uname="root";
		String pwd="root";
		
		datasource.setUrl(url);
		datasource.setUser(uname);
		datasource.setPassword(pwd);
		
		Connection conn=datasource.getConnection();
		
		if(conn!=null)
		{
			System.out.println("Connection established");
		}
		
		conn.close();
		
		
	}

}
