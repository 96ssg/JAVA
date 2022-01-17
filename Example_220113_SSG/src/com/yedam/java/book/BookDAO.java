package com.yedam.java.book;

import java.util.List;

public interface BookDAO {
	//책 등록
	public void insertbook(Book bk);
	//전체조회
	public List<Book> selectAll();
	//단건조회
	public Book selectbook(String bookName);
	//책 내용조회
	public Book selectbookInfo(String bookName);
	//책 대여
	public Book rentalbook(int rental);
	
	
}
