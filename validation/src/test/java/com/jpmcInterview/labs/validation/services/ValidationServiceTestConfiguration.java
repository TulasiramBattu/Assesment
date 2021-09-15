package com.jpmcInterview.labs.validation.services;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.jpmcInterview.labs.validation.services.AccountValidationService;

@Profile("test")
@Configuration
public class ValidationServiceTestConfiguration {
    @Bean
    @Primary
    public AccountValidationService nameService() {
        return Mockito.mock(AccountValidationService.class);
    }
}
