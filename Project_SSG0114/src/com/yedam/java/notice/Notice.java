package com.yedam.java.notice;

public class Notice {
	private String story;
	private String time;
	
	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Notice [공지 : " + story + ", 등록 시간 : " + time + "]";
	}

	
	
	
}
