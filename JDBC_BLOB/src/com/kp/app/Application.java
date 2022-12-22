package com.kp.app;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kp.JdbcUtil.*;

public class Application {
	
	
	public static void insert()
	{
		//Resources
		Connection conn=null;
		PreparedStatement pstmt=null;
	try
	{
		
		
		String sqlQuery="insert into college.profile(`Name`,`Image`) values(?,?);";
		
		File file=new File("Akhil.jpg");
		FileInputStream fis=new FileInputStream(file);
		
		conn=JdbcUtil.getJdbcConnection();
		if(conn!=null)
		{
			pstmt=conn.prepareStatement(sqlQuery);
			if(pstmt!=null)
			{
				pstmt.setString(1,"Akhil");
				pstmt.setBlob(2,fis);
				
				if(!pstmt.execute())
				{
					System.out.println("Image inserted successfully!");
				}
			}
			
		}
	}
	catch(FileNotFoundException fnfe)
	{
		System.out.println("File not found!");
	}
	catch(SQLException se)
	{
		se.printStackTrace();
		System.out.println("SQLException");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			JdbcUtil.closeConnection(conn,pstmt, null);
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
		
		
	}
	
	public static void retrive()
	{
		//Resources
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet resultSet=null;
	try
	{
		
		
		String sqlQuery="select * from college.profile where Name=\"Akhil\";";
	
		conn=JdbcUtil.getJdbcConnection();
		if(conn!=null)
		{
			pstmt=conn.prepareStatement(sqlQuery);
			if(pstmt!=null)
			{
				
				resultSet=pstmt.executeQuery();
				if(resultSet!=null)
				{
					while(resultSet.next())
					{
						System.out.println(resultSet.getString(1));
						
						//fetching the image
						InputStream is=resultSet.getBinaryStream(2);
						
						File f=new File("Akhil_download.jpg");
						FileOutputStream fos=new FileOutputStream(f);
												
						byte[] buffer=new byte[22048];
						
						if(is.read(buffer)>0)
						{
							fos.write(buffer);
						}
						fos.flush();
						System.out.println("image downloaded to ::"+f.getAbsolutePath());
					
//						while()
//						
//						int i=is.read();
//						while(i!=-1)
//						{
//							fos.write(i);
//							i=is.read();
//						}
						
					}
				}
			}
			
		}
	}
	catch(FileNotFoundException fnfe)
	{
		System.out.println("File not found!");
	}
	catch(SQLException se)
	{
		se.printStackTrace();
		System.out.println("SQLException");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			JdbcUtil.closeConnection(conn,pstmt, resultSet);
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
		
		
	}

	public static void main(String args[])
	{
		//insert();
		retrive();
	}

}
