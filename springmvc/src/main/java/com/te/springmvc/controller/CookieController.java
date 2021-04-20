package com.te.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	@GetMapping("/cookie")
	public String getCookie() {
		return "cookie";
		
	}
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response, ModelMap map) {
		Cookie cookie= new Cookie("EmpName", "prabanda");
		response.addCookie(cookie);
		map.addAttribute("msg", "created cookies");
		return "cookie";
		
		
	}
	@GetMapping("/showCookie")
	public String showCookie(ModelMap map,@CookieValue(name = "EmpName", required = false) String name) {
		map.addAttribute("cookies",name);
		return "cookie";
		
	}

}
