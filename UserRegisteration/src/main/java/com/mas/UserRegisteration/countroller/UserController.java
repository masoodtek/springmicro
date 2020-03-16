package com.mas.UserRegisteration.countroller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.model.UserEntity;
import com.mas.UserRegisteration.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
		
	
	@RequestMapping("/addUserForm")
	public String loadForm(Model model) {
		User user = new User();
		model.addAttribute("loadForm", user);
		Map<Integer, String> allCountrys = getAllCountrys();
		model.addAttribute("allCountrys", allCountrys);
		return "addUserForm";

	}

	@GetMapping(value = "/getAllEmaildetails")
	@ResponseBody
	public String getEmailDetails(@RequestParam("userEmail") String userEmail) {
		 String checkEmail = userService.checkEmail(userEmail);
		return checkEmail;

	}

	@GetMapping(value = "/getAllcountrydetails")
	public Map<Integer,String> getAllCountrys() {
		Map<Integer, String> allCountry = userService.getAllCountry();
		return allCountry;

	}

	@GetMapping(value = "/getAllStateDetails")
	@ResponseBody
	public Map<Integer, String> getAllStates(@RequestParam("countryId") Integer countryId) {
		Map<Integer, String> allState = userService.getAllState(countryId);
		return allState;

	}

	@GetMapping(value = "/getAllCityDetails")
	@ResponseBody
	public Map<Integer, String>  getAllCitys(@RequestParam("stateId") Integer stateId) {
		 Map<Integer, String> allCity = userService.getAllCity(stateId);
		return allCity;

	}

	@PostMapping("/addUser")
	public String saveUserDetail(@ModelAttribute("loadForm") User user,Model model) {
		Boolean saveUser = userService.saveUser(user);
		if(saveUser) {
			model.addAttribute("message","Your Account is parcel-created, You can Active your Account with tem-password sended to your email ");
		}else{
			model.addAttribute("messages","Some think went worng,Plz retry");
		}
		return "addUserForm";

	}

}
