package com.jpmcInterview.labs.validation.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpmcInterview.labs.validation.ApplicationProps;
import com.jpmcInterview.labs.validation.dto.ValidationServiceRequest;
import com.jpmcInterview.labs.validation.dto.ValidationServiceResponse;
import com.jpmcInterview.labs.validation.services.AccountValidationService;


@RestController
public class ValidationController {

	@Autowired
	private AccountValidationService accountValidationService;
	
	@Autowired
	ApplicationProps props;
	
	@GetMapping("/test")
	public @ResponseBody String getSampleData() throws Exception {
		System.out.println("providers : "+ props.getProviders());
		return "sample application to test the sample data";
	}
	
	@PostMapping("/validate")
	public ResponseEntity<ValidationServiceResponse> validateAccounts(@RequestBody ValidationServiceRequest account) {
	
		ValidationServiceResponse res = accountValidationService.validateAccounts(account);
		
		
		return new ResponseEntity<ValidationServiceResponse>(res,HttpStatus.OK);
	}
	
	
}
