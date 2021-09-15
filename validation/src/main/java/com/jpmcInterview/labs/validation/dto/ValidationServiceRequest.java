package com.jpmcInterview.labs.validation.dto;

import java.util.List;

import lombok.Data;

@Data
public class ValidationServiceRequest {

	private long acountNumber;	
	private List<Provider> providers;
	
	
	public long getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(long acountNumber) {
		this.acountNumber = acountNumber;
	}
	
	public List<Provider> getProviders() {
		return providers;
	}
	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
}
