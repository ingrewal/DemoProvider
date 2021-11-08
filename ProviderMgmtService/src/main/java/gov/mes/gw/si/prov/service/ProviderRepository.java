package gov.mes.gw.si.prov.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.mes.gw.si.prov.model.ProviderInformation;


@Repository
public class ProviderRepository {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<ProviderInformation> getProviderDetails()
	{
		System.out.println(" Get provider 1");
		return jdbcTemplate.query("select * from ProviderInformation",
				(rs, rownum) -> new ProviderInformation(rs.getInt("providerId"), rs.getInt("taxId"), rs.getString("businessName"),rs.getString("serviceLocation")));
	}
	
	
	public int createProviderDetails(ProviderInformation provider)
	{
		System.out.println(" Add provider 2 ");
		return jdbcTemplate.update("insert into providerinformation(providerId,taxId,businessName,serviceLocation) values(?,?,?,?)",provider.getProviderId(),provider.getTaxId(),provider.getBusinessName(),provider.getServiceLocation() );
	}
	
	
	public int updateProviderDetails(ProviderInformation provider)
	{
		System.out.println(" update provider 3 ");
		return jdbcTemplate.update("update providerinformation set businessName =?  where providerId=?",provider.getBusinessName(),provider.getProviderId());
	}
	
}
