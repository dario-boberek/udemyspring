package com.in28minutes.spring.basics.step18.cdi;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PaymentProcessor implements PaymentProcessorInterface {

	@Inject
	private NSAConnectorDAO auditDao;

	@Override
	public void addMoney(String amount, String currencyCode) {
		//add amount in given currency to active account
		///additionally inform NSA about transaction
		auditDao.inform("+", "accountID", "datetime", amount, currencyCode);
	}
}
