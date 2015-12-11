package com.agile.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AdminServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out=res.getWriter();
		out.println("welcome success");
		
	}

}
