package com.investmentadvice.equityList.price;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquityPriceController {
	
	@Autowired
	EquityPriceService equityPriceService;
	
	@RequestMapping(method=RequestMethod.POST, value="/equityPrice")
	public void equityPrice(@RequestBody EquityPrice equityPrice)
	{
		equityPriceService.addEquityPrice(equityPrice);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/analystId/{analystId}/equity/{symbol}")
	public EquityPrice getPriceForEquity(@PathVariable String symbol,@PathVariable String analystId)
	{
		System.out.println("<----------------------------getPriceForEquity------------------>"+symbol+"AnalystId: "+analystId);
		//AnalystAndEquity
		//return equityPriceService.getPriceForAnalystEquity(symbol, analystId);
		//return equityPriceService.findByAnalystIdAndSymbol(analystId, symbol);
		return equityPriceService.getByPK(new AnalystAndEquity(analystId, symbol));
	}
}
