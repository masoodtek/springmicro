package com.mas.UserRegisteration.countroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.model.UserEntity;
import com.mas.UserRegisteration.service.PazzwordService;
@Controller
public class PazzwordCountroller {
	
	@Autowired
	private PazzwordService pazzwordService;
		
	@RequestMapping("/password")
	public String passwordForm(HttpServletRequest hsr,Model model) {
		User user = new User();
		String email =hsr.getParameter("userEmail");
		model.addAttribute("password", user);
		model.addAttribute("email", email);
		return "password";

	}

	@RequestMapping("/changepassword")
	public String passworFormSubmit(@ModelAttribute("password") User user ,Model model) {
		UserEntity checkTempPassword = pazzwordService.checkTempPassword(user.getUserPazzword());
		if(checkTempPassword!=null) {
			Boolean activeAccount = pazzwordService.activeAccount(user, checkTempPassword);
			if(activeAccount) {
				model.addAttribute("msg","Your Account Is Active you Can Login");
			}else {
				model.addAttribute("msg","Some Think is worng Plz Try Agian");
			}
		}
		return "password";
		
			
	}
}
