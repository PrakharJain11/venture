package com.investmentadvice.equityList.price;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.investmentadvice.equityList.analystRisk.AnalystRisk;

@Entity
public class EquityPrice {

	@EmbeddedId
	@JsonProperty("equity_target")
	public AnalystAndEquity analystAndEquity;
	public double buyPrice;
	public double targetPrice;
	public int durationInWeek;
	
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public double getTargetPrice() {
		return targetPrice;
	}
	public void setTargetPrice(double targetPrice) {
		this.targetPrice = targetPrice;
	}
}
