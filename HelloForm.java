package com.runoob.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String user="123";
    private String pass="123";
    private PageRedirect pr=new PageRedirect();
    public HelloForm() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String name=new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
		String password=new String(request.getParameter("password"));
		if(name.equals(user)&&password.equals(pass)){
			pr.doGet(request, response);
			}else{
				out.println("Username or Password error!!!");
			}
		}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
