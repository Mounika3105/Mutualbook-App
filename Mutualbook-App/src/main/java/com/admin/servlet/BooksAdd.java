package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.entity.BookDtls;

@WebServlet("/add_books")
public class BooksAdd extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try
		{
			String bookName=req.getParameter("bname");
			String author=req.getParameter("author");
			String categories=req.getParameter("categories");
			String status=req.getParameter("status");
			Part part=req.getPart("bimg");
			String fileName=part.getSubmittedFileName();
			
			BookDtls b=new BookDtls(bookName,author,categories,status,fileName,"admin");
			System.out.println(b);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
