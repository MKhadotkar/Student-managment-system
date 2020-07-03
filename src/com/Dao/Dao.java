package com.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DB.cp;
import com.userBean.*;

public class Dao {
	
	public static boolean insertData(student s1)
	{
		boolean f=false;
		
		try
		{
			Connection con= cp.createC();
			
			String q="insert into stud (name,rollno,city)values(?,?,?)";
			
			PreparedStatement st=con.prepareStatement(q);
			
			st.setString(1, s1.getName());
			st.setString(2, s1.getRollNo());
			st.setString(3, s1.getCity());
			
			st.executeUpdate();
			f=true;

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
	

	public static boolean deleteData(String s)
	{
		boolean f=false;
		
		try
		{
			Connection con= cp.createC();
			
			String q="delete from stud where rollno = ?";
			
			PreparedStatement st=con.prepareStatement(q);
			st.setString(1, s);
			
			st.executeUpdate();
			f=true;

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
	
	
}
