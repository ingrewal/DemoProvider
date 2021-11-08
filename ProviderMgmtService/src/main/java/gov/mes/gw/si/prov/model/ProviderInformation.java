package gov.mes.gw.si.prov.model;

public class ProviderInformation {
	
	private int providerId;
	
	private int taxId;
	
	private String businessName;
	
	private String serviceLocation;

	
	
	public ProviderInformation(int providerId, int taxId, String businessName, String serviceLocation) {
		super();
		this.providerId = providerId;
		this.taxId = taxId;
		this.businessName = businessName;
		this.serviceLocation = serviceLocation;
	}

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getServiceLocation() {
		return serviceLocation;
	}

	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}
	

}
