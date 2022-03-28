package com.saquib.filterone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterTwo implements Filter{
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException, ServletException
	{	
		PrintWriter out=res.getWriter();
		out.println("this is a scend servlet");
		chain.doFilter(req, res);
	}
}
