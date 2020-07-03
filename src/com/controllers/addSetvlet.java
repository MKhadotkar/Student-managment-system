package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.Dao;
import com.userBean.student;




@WebServlet("/addData")
public class addSetvlet extends HttpServlet {
	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("sname");
		String rollNo=request.getParameter("rno");
		String city=request.getParameter("city");
		
		PrintWriter out = response.getWriter();
		
		student s1=new student(name,rollNo,city);
		
		boolean ans=Dao.insertData(s1);
		String s=String.valueOf(ans);
		request.setAttribute("res", s);
		request.setAttribute("data", 1);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


}
