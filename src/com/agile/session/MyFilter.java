package com.agile.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		PrintWriter out=arg1.getWriter();
		String password=arg0.getParameter("password");
		if(password.equals("sarma"))
		{
		arg2.doFilter(arg0, arg1);
		}
		else
		{
			out.println("paasword is wrong");
			RequestDispatcher rd=arg0.getRequestDispatcher("login.html");
			rd.include(arg0, arg1);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

	
}
