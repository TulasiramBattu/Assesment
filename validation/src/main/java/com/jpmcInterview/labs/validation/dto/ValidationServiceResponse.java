package com.jpmcInterview.labs.validation.dto;

import java.util.List;

import lombok.Data;

@Data
public class ValidationServiceResponse {
	private List<ProviderResponse> result;

	public List<ProviderResponse> getResult() {
		return result;
	}

	public void setResult(List<ProviderResponse> result) {
		this.result = result;
	}

}
