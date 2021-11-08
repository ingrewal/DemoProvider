package gov.mes.gw.si.prov.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.mes.gw.si.prov.model.ProviderInformation;
import gov.mes.gw.si.prov.service.ProviderMgmtService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ProviderMgmtController {
	
	@Autowired
	ProviderMgmtService providerService;
	
	@ApiOperation(value="hellow Swagger", notes="just get swag")
	@GetMapping("/inquireProvider")
	private List<ProviderInformation> inquireProviderDetails()
	{
		System.out.println(" inside inquiry provider");
		return providerService.inquireProvider();
	}
	
	@PostMapping("/createProvider")
	private int createProvider(@RequestBody ProviderInformation provider)
	{
		System.out.println(" inside create Provider");
		return providerService.createProvider(provider);
	}

	@PostMapping("/updateProvider")
	private int updateProvider(@RequestBody ProviderInformation provider)
	{
		System.out.println(" inside update Provider");
		return providerService.updateProvider(provider);
	}
}
