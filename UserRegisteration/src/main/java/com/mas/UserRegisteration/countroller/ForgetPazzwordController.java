package com.mas.UserRegisteration.countroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.service.ChangerPazzwordService;


@Controller
public class ForgetPazzwordController {
	
	@Autowired
	private ChangerPazzwordService changerPazzwordService;
	
	@RequestMapping("/forgetpassword")
	public String changePazzForm(Model model) {
		User user = new User();
		model.addAttribute("login", user);
		return "forgetpassword";

	}
	@RequestMapping("/changepazzword")
	public String changerPazzword(@ModelAttribute("login") User user,Model model) {
		System.out.println(user);
		String changePazzword = changerPazzwordService.changePazzword(user);
		if(changePazzword=="present") {
			model.addAttribute("msg","paswword sent to your mail");
		}else {
			model.addAttribute("msg","plz enter right email");
		}
		return "forgetpassword";

	}
}
