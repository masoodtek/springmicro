package com.mas.UserRegisteration.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mas.UserRegisteration.domin.City;
import com.mas.UserRegisteration.domin.Country;
import com.mas.UserRegisteration.domin.State;
import com.mas.UserRegisteration.domin.User;
import com.mas.UserRegisteration.model.CityEntity;
import com.mas.UserRegisteration.model.CountryEntity;
import com.mas.UserRegisteration.model.StateEntity;
import com.mas.UserRegisteration.model.UserEntity;
import com.mas.UserRegisteration.repository.CityRepository;
import com.mas.UserRegisteration.repository.CountryRepository;
import com.mas.UserRegisteration.repository.StateRepository;
import com.mas.UserRegisteration.repository.UserRepository;
import com.mas.UserRegisteration.utils.EmailUtil;
import com.mas.UserRegisteration.utils.PazzwordUtil;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private EmailUtil emailUtil;
//Save User Record
	public Boolean saveUser(User user) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setActiveFlag('l');
		userEntity.setCreatedBy("masood");
		userEntity.setUpdatedBy("masood");
		userEntity.setUserPazzword(PazzwordUtil.getAlphaNumericString(6));

		UserEntity entity = userRepository.save(userEntity);
		if (entity.getUserId() != null) {
			emailUtil.sendEmail(userEntity);
		}
		return entity != null;

	}
	//Get All Country Record
	public Map<Integer, String> getAllCountry() {

		Map<Integer, String> countryMap = new LinkedHashMap<>();
		List<CountryEntity> findAll = countryRepository.findAll();
		findAll.forEach(city -> {
			countryMap.put(city.getCountryId(), city.getCountryName());
		});
		return countryMap;
	}
	//Get All State Record
	public Map<Integer, String> getAllState(Integer countryId) {
		Map<Integer, String> countryMap = new LinkedHashMap<>();
		List<StateEntity> findAllByCountryId = stateRepository.findAllByCountryId(countryId);
		findAllByCountryId.forEach(states -> {
			countryMap.put(states.getStateId(), states.getStateName());
		});

		return countryMap;
	}
	//Get All City Record
	public Map<Integer, String> getAllCity(Integer stateId) {
		Map<Integer, String> cityMap = new LinkedHashMap<>();
		List<CityEntity> findAllByCityId = cityRepository.findAllByStateId(stateId);
		findAllByCityId.forEach(citys -> {
			cityMap.put(citys.getCityId(), citys.getCityName());
		});
		return cityMap;
	}
	//Check email Record
	public String checkEmail(String userEmail) {
		UserEntity findByUserEmail = userRepository.findByUserEmail(userEmail);
		System.out.println(findByUserEmail);
		if (findByUserEmail != null) {
			return "DUPLICATE";
		}
		return " NOT DUPLICATE";

	}
	
}
