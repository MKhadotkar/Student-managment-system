package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DB.cp;

/**
 * Servlet implementation class displayData
 */
@WebServlet("/displayData")
public class displayData extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		Connection con=cp.createC();
		
		String q="select * from stud where rollno = ?";
		
		String rollno=request.getParameter("rno");
		try {
			 PreparedStatement st=con.prepareStatement(q);
			 st.setString(1, rollno);
			 ResultSet set=st.executeQuery();
			out.print("<style type='text/css'>");
			out.print("tr,td,th {");
			out.print(" padding : 20px;");
			out.print("border: 1px solid black;");
			out.print("}");
			out.print("</style>");
			
			out.print("<center>");
			out.print("<h1>Student managment system</h1>");
			out.print("<table style='border: 1px solid black;border-collapse: collapse;'>");
			out.print("<tr><th>index No</th>");
			out.print("<th>Name</th>");
			out.print("<th>Roll no</th>");
			out.print("<th>City</th></tr>");
			int id=0;
			while(set.next())
			{
				id++;
				String name=set.getString(1);
				String rollNo=set.getString(2);
				String city=set.getString(3);
				out.print("<tr>");
				out.print("<td>"+id+"</td>");
				out.print("<td>"+name+"</td>");
				out.print("<td>"+rollNo+"</td>");
				out.print("<td>"+city+"</td>");
				out.print("</tr>");
			}
			out.print("</table>");
			out.print("</center>");
			
		
			out.println("<br><a href='index.jsp'>Click here</a> to go back to home page..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
