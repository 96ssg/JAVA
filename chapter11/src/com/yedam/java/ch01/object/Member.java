package com.yedam.java.ch01.object;

public class Member {
	//필드
	public String id;
	//생성자
	public Member(String id) {
		this.id = id;
		
	}
	//메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.id.equals(id);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public String toString() {
		return "id : " + id;
	}
	
}
