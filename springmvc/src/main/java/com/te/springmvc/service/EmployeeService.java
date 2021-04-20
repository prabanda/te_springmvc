package com.te.springmvc.service;

import java.util.List;

import com.te.springmvc.dto.EmployeeBean;

public interface EmployeeService {

public EmployeeBean authenicate(int id, String pw);
	
	public EmployeeBean getId(int id); 
	public boolean delete(int id); 

	public List<EmployeeBean> getAllEmployees();

	public boolean getAddEmployee(EmployeeBean empData);
	
	public boolean  updateEmployee(EmployeeBean employeeBean);


}
