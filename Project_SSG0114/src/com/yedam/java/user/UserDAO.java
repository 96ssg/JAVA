package com.yedam.java.user;

import java.util.List;

public interface UserDAO {
	//회원등록
	public void insert(User user);
	//삭제
	public void delete(String userName);
	//조회
	public User selectUserInfo(String userId, int userPassword);
	//대여횟수 업
	public void update(User user);
	//단건조회
	public User selectUser(String userName);
	//전체 유저 리스트
	public List<User> selectAll();
	
}
