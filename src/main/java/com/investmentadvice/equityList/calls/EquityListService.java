package com.investmentadvice.equityList.calls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquityListService {
	
	
	@Autowired
	private EquityRepository equityRepository;
	/*private List<Equity> equityList = Arrays.asList(
			new Equity("1001","Infy","Infosys"),
			new Equity("1002","BandhanBnk","Bandha Bank"),
			new Equity("1003","PNB","Punjab National Bank"),
			new Equity("1004","VEDL","Vedanta")
			); */
	
	
	public List<Equity> getAllEqity(){
		System.out.println("---------------------------In Get All Equity");
		List<Equity> equities = new ArrayList<Equity>();
		equityRepository.findAll().forEach(equities::add);
		return equities;
		//return equityList;
	}
	
	public void addEquity(Equity equity)
	{
		System.out.println("<---------------In Add Equity");
		equityRepository.save(equity);
	}
	
	/*public Equity getEquity(String symbol)
	{
		
		System.out.println("--------------------------------------->"+symbol);
		
		return equityList.stream().filter(t->t.getSymbol().equals(symbol)).findFirst().get();
	}
*/	
}

