package com.in28minutes.spring.basics.step18.cdi;

public interface PaymentProcessorInterface {
	void addMoney(String amount, String currencyCode);
}
