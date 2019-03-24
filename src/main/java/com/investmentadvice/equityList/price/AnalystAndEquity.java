package com.investmentadvice.equityList.price;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AnalystAndEquity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public String symbol;
	public String analystId;
	
	public AnalystAndEquity() {
		super();
	}
	
	public AnalystAndEquity(String symbol, String analystId) {
		super();
		this.symbol = symbol;
		this.analystId = analystId;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getAnalystId() {
		return analystId;
	}
	public void setAnalystId(String analystId) {
		this.analystId = analystId;
	}
	
}
