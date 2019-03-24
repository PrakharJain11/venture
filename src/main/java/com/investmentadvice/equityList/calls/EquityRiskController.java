/*package com.investmentadvice.equityList.calls;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquityRiskController {
	
	@Autowired
	public EquityRiskService equityRiskService;
	
	@RequestMapping("/risk/{id}")
	public List<Map<String,List<String>>> getEquityWithAnalyst(@PathVariable int id)
	{
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/equityRisk")
	public void addEquityWithRisk(@RequestBody EquityRisk equityRisk)
	{
		System.out.println("----------------------->In addEquityWithRisk");
		equityRiskService.addEquityRisk(equityRisk);
	}
	
}
*/