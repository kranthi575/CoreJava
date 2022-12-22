package in.kp.JdbcUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetApp {

	public static void main(String[] args) throws SQLException,FileNotFoundException,IOException{
		
		RowSetFactory factory = RowSetProvider.newFactory();
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("Jdbc.properties");
		prop.load(fis);
		
		JdbcRowSet jdbcRowSet = factory.createJdbcRowSet();
		jdbcRowSet.setUrl(prop.getProperty("url"));
		jdbcRowSet.setUsername(prop.getProperty("uname"));
		jdbcRowSet.setPassword(prop.getProperty("pwd"));

		jdbcRowSet.setCommand("select * from college.student");
		jdbcRowSet.execute();

		System.out.println("Student details in forward direction");
		System.out.println("SID\tSNAME\tSDEPT");
		System.out.println("------------------------------");
		while (jdbcRowSet.next()) {
			System.out.println(jdbcRowSet.getString(2) + "\t" + jdbcRowSet.getString(3) + "\t" + jdbcRowSet.getString(4));
		}

		System.out.println();

		System.out.println("Student details in backward direction");
		System.out.println("SID\tSNAME\tSAGE\tSADDR");
		System.out.println("------------------------------");
		while (jdbcRowSet.previous()) {
			System.out.println(jdbcRowSet.getString(2) + "\t" + jdbcRowSet.getString(3) + "\t" + jdbcRowSet.getString(4));		}

		/*
		 * // performing insert operation using jdbcRowSet jdbcRowSet.moveToInsertRow();
		 * 
		 * jdbcRowSet.updateInt(1, 63); jdbcRowSet.updateString(2, "SKY");
		 * jdbcRowSet.updateInt(3, 31); jdbcRowSet.updateString(4, "MI");
		 * 
		 * jdbcRowSet.insertRow();
		 * 
		 * System.out.println("Record inserted succesfully");
		 */

		//take the cursor to the 4th row from the begining of the rowSet object
		jdbcRowSet.absolute(4);
		System.out.println(jdbcRowSet.getString(2));
		//jdbcRowSet.deleteRow();
		//System.out.println("Row deleted succesfully...");


	}

}
