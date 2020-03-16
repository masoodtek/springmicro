package com.snn.pm.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snn.pm.domean.Address;
import com.snn.pm.entity.AddressEntity;
import com.snn.pm.repository.AddressRepository;

@Service
public class AddressServiceImpl {
	@Autowired
	private AddressRepository addressRepository;

	public Address savePersonAddress(Address address) {
		AddressEntity addressEntity = new AddressEntity();
		BeanUtils.copyProperties(address, addressEntity);
		AddressEntity entity = addressRepository.save(addressEntity);
		Address address1 = new Address();
		BeanUtils.copyProperties(entity, address1);
		return address1;

	}
}
