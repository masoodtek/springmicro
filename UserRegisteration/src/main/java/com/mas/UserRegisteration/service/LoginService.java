package com.mas.UserRegisteration.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.model.UserEntity;
import com.mas.UserRegisteration.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User login(User user) {
		User userDetails = new User();
		UserEntity loginToHome = userRepository.findByUserEmailAndUserPazzword(user.getUserEmail(), user.getUserPazzword());
		if(loginToHome!=null) {
		BeanUtils.copyProperties(loginToHome,userDetails);
		}
		return userDetails;
		
	}


}