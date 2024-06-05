package com.springdemo.demo;

public class CustomerManager implements ICustomerService {

	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	// Customer Manager parametre olarak bir customerDal istiyor.

	public void add() {

		customerDal.add();
	}

}
