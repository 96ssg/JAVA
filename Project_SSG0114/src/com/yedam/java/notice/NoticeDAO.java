package com.yedam.java.notice;

import java.util.List;

public interface NoticeDAO {
	//์๋ ฅ
	public void insert(Notice notice);
	
	//์กฐํ
	public List<Notice> select();
	
}
