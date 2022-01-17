package com.yedam.java.notice;

import java.util.List;

public interface NoticeDAO {
	//입력
	public void insert(Notice notice);
	
	//조회
	public List<Notice> select();
	
}
