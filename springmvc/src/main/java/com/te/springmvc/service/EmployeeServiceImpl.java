package com.te.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springmvc.controller.dao.EmployeeDao;
import com.te.springmvc.dto.EmployeeBean;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao;

	@Override
	public EmployeeBean authenicate(int id, String pw) {

		return dao.authenicate(id, pw);
	}

	@Override
	public EmployeeBean getId(int id) {

		return dao.getId(id);
	}

	@Override
	public List<EmployeeBean> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public boolean getAddEmployee(EmployeeBean empData) {
    return dao.getAddEmployee(empData);
		
	}

	@Override
	public boolean updateEmployee(EmployeeBean empData) {
		return dao.updateEmployee(empData);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
