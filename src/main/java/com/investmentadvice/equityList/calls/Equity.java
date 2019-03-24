package com.investmentadvice.equityList.calls;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.investmentadvice.equityList.price.AnalystAndEquity;

@Entity
public class Equity {
	
	/*Equity NSE or BSE symbol ex. Infy for Infosys*/
	@Id 
	public String symbol;
	public String isinCode;
	public String equityName;
	
	
	public Equity()
	{
		
	}
	
	public Equity(String isinCode, String symbol, String equityName) {
		super();
		this.isinCode = isinCode;
		this.symbol = symbol;
		this.equityName = equityName;
	}
	public String getiSINCode() {
		return isinCode;
	}
	public void setISINCode(String isinCode) {
		this.isinCode = isinCode;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getEquityName() {
		return equityName;
	}
	public void setEquityName(String equityName) {
		this.equityName = equityName;
	}

}
