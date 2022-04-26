package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.BookDtls;

public class BookDAOImpl implements BookDAO{
private Connection conn;
	public BookDAOImpl(Connection conn) {
	super();
	this.conn = conn;
}
	@Override
	public boolean addBooks(BookDtls b) {
		boolean f=false;
		try
		{	
		String sql="insert into book_dtls(bookId,bookname,author,bookCategory,status,photo,email)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,b.getBookName());
		ps.setString(2,b.);
		ps.setString(3,sql);
		ps.setString(4,sql);
		ps.setString(5,sql);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	
	

}
