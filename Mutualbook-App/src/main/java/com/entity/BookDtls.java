package com.entity;

public class BookDtls {

	private int bookId;
	private String bookName;
	private String author;
	private String bookCategory;
	private String status;
	private String photoName;
	private String email;
	public BookDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDtls(String bookName, String author, String bookCategory, String status, String photoName,
			String email) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bookCategory = bookCategory;
		this.status = status;
		this.photoName = photoName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "BookDtls [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", bookCategory="
				+ bookCategory + ", status=" + status + ", photoName=" + photoName + ", email=" + email + "]";
	}
	
	
}
