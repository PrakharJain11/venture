package com.investmentadvice.equityList.analystRisk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalystRiskController {

	@Autowired
	public AnalystRiskService analystRiskService;
	
	@RequestMapping(method=RequestMethod.POST, value = "/analystRisk")
	public void addAnalystRisk(@RequestBody AnalystRisk analystRisk)
	{
		System.out.println("--------------------------->addAnalystRiskController");
		System.out.println("AnalystName: "+analystRisk.getAnalystName());
		System.out.println("Symbol: "+analystRisk.getSymbol());
		System.out.println("ID: "+analystRisk.getAnalystIdentity().getAnalystId());
		System.out.println("Risk: "+analystRisk.getAnalystIdentity().getRisk());
		analystRiskService.addAnalystRisk(analystRisk);
	}
	
	@RequestMapping("risk/{id}")
	public List<String> getEquityForRisk(@PathVariable int id)
	{
		//analystRiskService.getEquityForRisk(id);
		return analystRiskService.getEquityForRisk(id);
	}
	
	@RequestMapping("analystId/{id}")
	public List<AnalystRisk> getEquityForAnalyst(@PathVariable String id)
	{
		return analystRiskService.getEquityListForAnalyst(id);
	}
	
}
