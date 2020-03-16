package com.mas.resource.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@ApiModel(description = "All details about the CurrencyEntity. ")
public class CurrencyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated currencyId")
	private Integer currencyId;
	@ApiModelProperty(notes = "The Customer first currencyFrom")
	private String currencyFrom;
	@ApiModelProperty(notes = "The Customer first currencyTo")
	private String currencyTo;
	@ApiModelProperty(notes = "The Customer first currencyValue")
	private Integer currencyValue;
}
