package com.investmentadvice.equityList.analystRisk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class AnalystRisk {
	
	@EmbeddedId
	@JsonProperty("analyst_identity")
	public AnalystIdentity analystIdentity;
	
	public String analystName;
	public String symbol;
	
	public AnalystRisk() {
		super();
	}

	public AnalystRisk(AnalystIdentity analystIdentity, String analystName, String symbol) {
		super();
		this.analystIdentity = analystIdentity;
		this.analystName = analystName;
		this.symbol = symbol;
	}

	public String getAnalystName() {
		return analystName;
	}
	public AnalystIdentity getAnalystIdentity() {
		return analystIdentity;
	}
	public void setAnalystIdentity(AnalystIdentity analystIdentity) {
		this.analystIdentity = analystIdentity;
	}
	public void setAnalystName(String analystName) {
		this.analystName = analystName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}	
}
