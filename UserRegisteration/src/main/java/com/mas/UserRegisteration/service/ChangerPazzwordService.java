package com.mas.UserRegisteration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.model.UserEntity;
import com.mas.UserRegisteration.repository.UserRepository;
import com.mas.UserRegisteration.utils.EmailUtil;

@Service
public class ChangerPazzwordService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmailUtil emailUtil;
	
	public String changePazzword(User user) {
	
		UserEntity email = userRepository.findByUserEmail(user.getUserEmail());
		System.out.println(email);
		if(email.getUserId().isEmpty()) {
			return "isEmpty";
		}else {
			 emailUtil.sendEmail(email,1);
		}
		return 	"present";
		
	}
}
