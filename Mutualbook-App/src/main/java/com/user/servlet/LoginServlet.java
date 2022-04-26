package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try
		{
			UserDAOImpl dao=new UserDAOImpl(DBConnect.getConn());
			HttpSession session=req.getSession();
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			
			if("admin@gmail.com".equals(email) && "admin".equals(password))
			{//System.out.println(email+" "+password);
				User us=new User();
				session.setAttribute("userobj",us);//trying to set and check if user inputs are correct
	        resp.sendRedirect("admin/home.jsp");}	
			else
			{
				//to call dao.login method
				User us=dao.login(email, password);
				if(us!=null)
				{
					session.setAttribute("userobj",us);//passing user object if login is success
					resp.sendRedirect("home.jsp");//succes goes to home page
				}
				else
				{
					session.setAttribute("failedMsg","Invalid Username and Password");//passing failed mesage if login is failure
					resp.sendRedirect("login.jsp");//if failed goes to login page
				}
			 
				resp.sendRedirect("home.jsp");
			}
		}
		
		catch(Exception e)
		{
			
		}
	}

}
