package com.mas.UserRegisteration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mas.UserRegisteration.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	//@Query(value = "select * from USERDEATILSSS where EMAIL= :userEmail",nativeQuery = true)
	public UserEntity findByUserEmail(String userEmail);
	
	public UserEntity findByUserPazzword(String userPazzword);
	
	public UserEntity findByUserEmailAndUserPazzword(String userEmail,String userPazzword);
	
}
