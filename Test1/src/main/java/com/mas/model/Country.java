package com.mas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Country {
	@Id
	private String countryId;
	private String counteyName;
	

}
