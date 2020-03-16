package com.mas.resource.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mas.resource.model.CurrencyEntity;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {
public CurrencyEntity findByCurrencyFromAndCurrencyTo(String currencyFrom,String currencyTo);
}
