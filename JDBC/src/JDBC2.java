import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) throws SQLException{
		
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

}
