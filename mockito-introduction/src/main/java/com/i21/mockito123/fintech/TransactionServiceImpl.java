package com.i21.mockito123.fintech;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionServiceImpl {

	BlockchaninDataService bds;


	public TransactionServiceImpl() {
		super();
	}

	public TransactionServiceImpl(BlockchaninDataService bds) {
		super();
		this.bds = bds;
	}

	//example...
	public Bitcoin createBitcoint() {
		return new Bitcoin( getId() /*, param2, param3, .... */);
	}


	//i21c: funkcja którą chcemy testowac (uzywa interfejsu do którego nie mamy implementacji !)
	public String getId() {
		int[] availableID = bds.getAvailableID();

		String id = Arrays.stream(availableID).boxed().map(Object::toString).collect(Collectors.joining("]["));
		id = "["+id+"]";
		return id;
	}
}


