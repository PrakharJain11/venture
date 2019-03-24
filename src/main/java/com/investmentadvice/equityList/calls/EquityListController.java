package com.investmentadvice.equityList.calls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquityListController {
	
	@Autowired
	public EquityListService equityService;
	
	@RequestMapping("/equities")
	public List<Equity> getAllEquity()
	{
		System.out.println("--------------------------------------------");
		return equityService.getAllEqity();
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/equity")
	public void addEquity(@RequestBody Equity equity)
	{
		equityService.addEquity(equity);
	}
	
	//@RequestMapping("/equity/{symbol}")
	/*public Equity getEquityPrice(@PathVariable String symbol)
	{
		System.out.println("----------------------------------------->"+symbol);
		return equityService.getEquity(symbol);
	}*/
}
