package com.te.springmvc.controller.dao;

import java.util.List;

import com.te.springmvc.dto.EmployeeBean;

public interface EmployeeDao {
	
	
	public EmployeeBean authenicate(int id, String pw);
	public EmployeeBean getId(int id); 
	public List<EmployeeBean> getAllEmployees();
	public boolean getAddEmployee(EmployeeBean employeeBean);
	public boolean  updateEmployee(EmployeeBean employeeBean);
	boolean delete(int id); 
}
