package com.example.spring.one.telaviv.customerservice;

/**
 * @author Olga Maciaszek-Sharma
 */
public interface VerificationServiceClient {

	CustomerVerificationResult verify(CustomerApplication customerApplication);
}
