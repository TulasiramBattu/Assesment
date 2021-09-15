package com.jpmcInterview.labs.validation.dto;

import lombok.Data;

@Data
public class ProviderResponse {
	private String providerName;
	private boolean isValid;
	
	
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
	public ProviderResponse(String providerName, boolean isValid) {
		this.setProviderName(providerName);
		this.setValid(isValid);
		
	}


}
