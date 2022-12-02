//rt.jar file
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//MySQL-JAR => given by mysql db driver
import com.mysql.cj.jdbc.Driver;

public class jdbc1 {

	public static void main(String[] args) throws SQLException {
		
		//1.Loading Driver
//		Driver driver = new Driver();
//		//register the driver
//		DriverManager.registerDriver(driver);
//		
		//2.Establish the connection
		String url="jdbc:mysql://127.0.0.1:3306/?user=root";
		String username="root";
		String password="root";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		
		//3.use the statement object to send the query for execution
		
		Statement statement = connection.createStatement();
		
		//4.using the statement object execute the Query
		
		String sqlSelectQuery = "select SID,SNAME,SAGE,SADDR from  enterprisejava.student";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		
		//5.process the resultset
		System.out.println("SID\tSNAME\tSAGE\tSADDR");
		
		while(resultSet.next())
		{
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Integer age = resultSet.getInt(3);
			String add = resultSet.getString   (4);
			
			System.out.println(id+"\t"+name+"\t"+age+"\t"+add);
		}
		
		connection.close();
		

	}

}
