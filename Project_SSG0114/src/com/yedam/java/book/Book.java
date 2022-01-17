package com.yedam.java.book;

public class Book {
	private String bookName;
	private String bookWriter;
	private String bookContent;
	private int bookRental;
	private int bookRoll;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public int getBookRental() {
		return bookRental;
	}
	public void setBookRental(int bookRental) {
		this.bookRental = bookRental;
	}
	
	public int getBookRoll() {
		return bookRoll;
	}
	public void setBookRoll(int bookRoll) {
		this.bookRoll = bookRoll;
	}
	@Override
	public String toString() {
		return "도서명 : " + bookName + " ,  저자명 : " + bookWriter + " , 내용 : " + bookContent
			+ " , 대여여부 : " + bookRental + ", 대여횟수 : " + bookRoll;
	}
	
	
}
