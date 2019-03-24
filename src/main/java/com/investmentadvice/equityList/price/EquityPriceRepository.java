package com.investmentadvice.equityList.price;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquityPriceRepository extends CrudRepository<EquityPrice, AnalystAndEquity>{
	//public EquityPrice findByAnalystIdAndSymbol(String analystName, String symbol);
}
