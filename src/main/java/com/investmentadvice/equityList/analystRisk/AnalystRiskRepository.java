package com.investmentadvice.equityList.analystRisk;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalystRiskRepository extends CrudRepository<AnalystRisk, AnalystIdentity> {
	//public List<AnalystRisk> findByAnalystName(String analystName);
}
