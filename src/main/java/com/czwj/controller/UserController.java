package com.czwj.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czwj.domain.User;
import com.czwj.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping("user")
	public String user(Model model){
		User userInformationById = userService.getUserInformationById(1);
		model.addAttribute("user",userInformationById);
		return "showUser";
	}
	
	@Test
	public void test(){

		User userInformationById = userService.getUserInformationById(1);
		System.out.println(userInformationById);
		System.out.println(userService.getClass().getName());
		userService.aa();
	}
}
