package com.jpmcInterview.labs.validation.dto;

import lombok.Data;

@Data
public class ProviderRequest {
	private long accountNumber;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

}
