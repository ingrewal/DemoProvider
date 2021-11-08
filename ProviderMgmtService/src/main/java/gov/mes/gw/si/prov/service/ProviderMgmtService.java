package gov.mes.gw.si.prov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.mes.gw.si.prov.model.ProviderInformation;

@Service
public class ProviderMgmtService {

	@Autowired
	ProviderRepository providerRepository;
	
	
	public List<ProviderInformation> inquireProvider()
	{
		return providerRepository.getProviderDetails();
	}
	
	public int createProvider(ProviderInformation provider)
	{
		return providerRepository.createProviderDetails(provider);
	}
	
	public int updateProvider(ProviderInformation provider)
	{
		return providerRepository.updateProviderDetails(provider);
	}
}
