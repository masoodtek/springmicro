package com.mas.UserRegisteration.countroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String loginForm(Model model) {
		User user = new User();
		model.addAttribute("login", user);
		return "login";

	}
	@RequestMapping("/logintohome")
	public String login(@ModelAttribute("login") User user,RedirectAttributes attributes,Model model) {
		System.out.println(user);
		User login = loginService.login(user);
		if(login!=null) {
			if(login.getActiveFlag().equals('r')) {
				attributes.addFlashAttribute("userName",login.getUserName());
				attributes.addFlashAttribute("msg", "succes");
				return "home";
			}else {
				model.addAttribute("msg", "Active your account");
				return "login";
			}
		}
		model.addAttribute("msg", "Plz enter Right password");
		return "login";
	}
	@RequestMapping("/forgetpassword")
	public String forgetPassword(@ModelAttribute("login") User user) {
		System.out.println(user);
		return "login";

	}
	
}
