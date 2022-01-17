package com.yedam.java.book;

import java.util.List;

public interface BookDAO {
	// 전체조회
	public List<Book> selectAll();

	// 단건조회
	public Book selectBook(String bookName);

	// 등록
	public void insert(Book book);

	// 수정
	public void update(Book book);

	// 삭제
	public void delete(String bookName);
	
	//수정 2 bookroll ++
	public void update2(Book book);
	
	// 대여횟수 전체조회
	public List<Book> selectRoll();
}
