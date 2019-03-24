/*package com.investmentadvice.equityList.calls;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EquityRisk {
	
	public EquityRisk() {
		super();
	}
	//public String analystName;
	@ElementCollection(targetClass=String.class)
	public List<Map<String,List<String>>> analystEquity = new ArrayList<Map<String,List<String>>>();
	
	@Id
	public int risk;
	public int getRisk() {
		return risk;
	}
	public void setRisk(int risk) {
		this.risk = risk;
	}
	public List<Map<String, List<String>>> getAnalystEquity() {
		return analystEquity;
	}
	public void setAnalystEquity(List<Map<String, List<String>>> analystEquity) {
		this.analystEquity = analystEquity;
	}

	
	
	
	

	
	
}
*/