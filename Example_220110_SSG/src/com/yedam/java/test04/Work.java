package com.yedam.java.test04;

public class Work {
	// 필드
	private static int serialNum = 0; // 할일번호
	private int jobNo;
	private String job; //할일
	private boolean fin;//할일완료여부
	
	//생성자
	public Work(String job) {
		serialNum++;
		this.jobNo = serialNum;
		this.job = job;
		this.fin = false;
	}

	public int getJobNo() {
		return jobNo;
	}

	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}
	
}
