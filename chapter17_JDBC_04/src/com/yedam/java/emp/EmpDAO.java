package com.yedam.java.emp;

import java.util.List;

public interface EmpDAO {
	public List<Emp> selectAll();
	
	public Emp selectOne(int employeeId);
	
	public void insert(Emp em);
	
	public void update(Emp em);
	
	public void delete(int employeeId);
}
