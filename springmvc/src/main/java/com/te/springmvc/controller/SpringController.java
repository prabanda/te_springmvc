package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.dto.UserBean;

@Controller
public class SpringController {
	@RequestMapping(path ="/home", method =RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/WEB-INF/view/HomePage.jsp");
		return modelAndView;
		
		
	}
	@RequestMapping(path = "/services", method = RequestMethod.GET)
	public ModelAndView getServices() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/WEB-INF/view/ServicePage.jsp");
		return modelAndView; 
		
	}
//	@RequestMapping(path="/search", method = RequestMethod.GET)
//	public ModelAndView getData(ModelAndView modelAndView,HttpServletRequest request) {
//		String name=request.getParameter("name");
//		modelAndView.addObject("UserName", name);
////		request.setAttribute("UserName",name);
//		modelAndView.setViewName("NewHome");
//		return modelAndView;
//		}
	@GetMapping("/login")
	public String getLogin() {
		return "LoginForm";
		
	}
	@PostMapping("/login")
	public String  getFormat(HttpServletRequest request,ModelMap modelMap) {
		String name=request.getParameter("user");
		int password= Integer.parseInt(request.getParameter("pw"));
		modelMap.addAttribute("name",name);
		modelMap.addAttribute("pw",password);
		return "UserDetails";
	}
	@PostMapping("/login1")
	public String name(ModelMap modelMap, int pw, String user) {
		modelMap.addAttribute("name", user);
		modelMap.addAttribute("pw", pw);
		return "UserDetails";
		
	}
	@PostMapping("/login2")
	public String getUserName(UserBean userBean, ModelMap modelMap) {
		
		modelMap.addAttribute( "name",userBean.getUser());
		modelMap.addAttribute( "pw",userBean.getPw());
		return "UserDetails";
		
		
	}
	@PostMapping("/login3")
	public String getRequestParam(ModelMap modelMap,@RequestParam(name="") String user,@RequestParam(name="pw") int password) {
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("pw", password);
		return "UserDetails";
		
	}
	

}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		