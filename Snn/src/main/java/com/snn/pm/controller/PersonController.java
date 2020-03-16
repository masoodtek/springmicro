package com.snn.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.snn.pm.domean.Address;
import com.snn.pm.domean.Person;
import com.snn.pm.service.PersonServiceImp;

@Controller
public class PersonController {
	@Autowired
	private PersonServiceImp personServiceImp;

	@RequestMapping("/loadpersonform")
	public String fromLodder(Model model) {
		Person per = new Person();
		model.addAttribute("person", per);

		return "loadpersonform";

	}

	@RequestMapping("/savepersondetails")
	public String savePersonDetails(@ModelAttribute("person") Person person,Model model,RedirectAttributes attributes ) {
		Person savePersonDetails = personServiceImp.savePersonDetails(person);
		System.out.println(savePersonDetails);
		//attributes.addFlashAttribute("person", savePersonDetails);
		Address address = new Address();
		model.addAttribute("person", savePersonDetails);
		model.addAttribute("address", address);
		
		return "addressform";

	}

}
