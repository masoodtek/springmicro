package com.mas.UserRegisteration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.model.UserEntity;
import com.mas.UserRegisteration.repository.UserRepository;

@Service
public class PazzwordService {
	
	@Autowired
	private UserRepository userRepository;
	//Check Pazzword
		public UserEntity checkTempPassword(String pazzword) {
			UserEntity findByUserPazzword = userRepository.findByUserPazzword(pazzword);

			return findByUserPazzword;

		}
		//change temp-pass to passs
		public Boolean activeAccount(User user, UserEntity userEntity) {

			userEntity.setActiveFlag('r');
			userEntity.setUserPazzword(user.getNewPazzword());
			UserEntity save = userRepository.save(userEntity);
			if (save != null) {
				return true;
			}
			return false;

		}
}
