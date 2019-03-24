package com.investmentadvice.equityList.analystRisk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investmentadvice.equityList.price.AnalystAndEquity;
import com.investmentadvice.equityList.price.EquityPrice;
import com.investmentadvice.equityList.price.EquityPriceService;

@Service
public class AnalystRiskService {
	
	@Autowired
	private AnalystRiskRepository analystRiskRepository;
	
	@Autowired
	private EquityPriceService equityPriceService;
	
	public void addAnalystRisk(AnalystRisk analystRisk)
	{
		analystRiskRepository.save(analystRisk);
	}
	
	public List<String> getEquityForRisk(int id)
	{
		List<AnalystRisk> list = new ArrayList<>();
		List<String> smbol = new ArrayList<>();
		analystRiskRepository.findAll()
		.forEach(list::add);
		
		list.stream().filter(eqty->eqty.getAnalystIdentity().getRisk() == id)
		.forEach(eqty->System.out.println(eqty.getSymbol()));
		
		
		for(int j=0; j<list.size(); j++)
		{
			if(list.get(j).getAnalystIdentity().getRisk()==id)
			{
				smbol.add(list.get(j).getSymbol());
			}
		}
		
		return smbol;
	}
	
	public List<AnalystRisk> getEquityListForAnalyst(String id)
	{
		List<AnalystRisk> list = new ArrayList<>();
		List<EquityPrice> equityPrice = new ArrayList<>();
		
		for(int i=1; i<=5; i++)
		{
			try {
			list.add(analystRiskRepository.findOne(new AnalystIdentity(id,i)));
			}
			catch (NullPointerException npe) {
				System.out.println(npe.getMessage());
			}
		}
		
		
				
		for (AnalystRisk analystRisk : list) {
			String[] arr = analystRisk.getSymbol().split(",");
			
			for(int i=0; i<arr.length; i++)
			{
				equityPrice.add(equityPriceService.getByPK(new AnalystAndEquity(arr[i],analystRisk.getAnalystIdentity().getAnalystId())));
			}
		}
		
		for (EquityPrice equityPrice2 : equityPrice) {
			System.out.println("EquityPrice ::"+equityPrice2.analystAndEquity.getAnalystId()+"risk: "+equityPrice2.analystAndEquity.getSymbol()+"BP: "+equityPrice2.getBuyPrice()+"TP:"+equityPrice2.getTargetPrice());
		}
		
		return list;
	}
	
}
