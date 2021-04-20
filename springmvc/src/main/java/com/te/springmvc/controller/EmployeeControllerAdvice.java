package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.springmvc.customexceptions.EmployeeException;

@Controller
public class EmployeeControllerAdvice {
	@ExceptionHandler()
	public String handler(EmployeeException exp,HttpServletRequest request) {
		request.setAttribute("msg", exp.getMessage());
		return null;
		
	}

}
