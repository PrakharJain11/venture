package com.investmentadvice.equityList.price;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquityPriceService {
	
	@Autowired
	EquityPriceRepository equityPriceRepository;
	
	List<EquityPrice> equityPrice = new ArrayList<EquityPrice>();
	
	
	public void addEquityPrice(EquityPrice equityPrice)
	{
		equityPriceRepository.save(equityPrice);
	}
	
	public EquityPrice getByPK(AnalystAndEquity analystAndEquity)
	{
		//List<EquityPrice> equityPriceList = new ArrayList<>();
		EquityPrice eq = null;
		/*System.out.println("In getByPK: "+analystAndEquity.getAnalystId()+"Equity::"+analystAndEquity.getSymbol());
		System.out.println("Price Class Object:  "+equityPriceRepository.findOne(analystAndEquity));
		System.out.println("Price Class Detail:  "+equityPriceRepository.findOne(analystAndEquity).analystAndEquity.getAnalystId()+"Equity::"+equityPriceRepository.findOne(analystAndEquity).getBuyPrice());*/
		//equityPrice.add(equityPriceRepository.findOne(analystAndEquity));
		
		try {
			eq = equityPriceRepository.findOne(analystAndEquity);
			}
		catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
		return eq;
	}

}
