package com.niit.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.UserDao;
import com.niit.model.UserInfo;

@Controller
public class UserController {
	@Autowired
    UserDao userDao;
	
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String registerUser(Model m,@RequestParam("customerAddr")String customerAddr,@RequestParam("password")String password)
	{
		UserInfo user=new UserInfo();
		user.setCustomerAddr(customerAddr);
		user.setPassword(password);
		m.addAttribute("pageinfo","REGISTER");
		return "UserInfo";
	}
}	