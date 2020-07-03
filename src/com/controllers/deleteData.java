package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.Dao;

/**
 * Servlet implementation class deleteData
 */
@WebServlet("/deleteData")
public class deleteData extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rollNo=request.getParameter("rno");
		PrintWriter out = response.getWriter();
		
		boolean ans=Dao.deleteData(rollNo);
		String s=String.valueOf(ans);
		request.setAttribute("res", s);
		request.setAttribute("data", 2);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
