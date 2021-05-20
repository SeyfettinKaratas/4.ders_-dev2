package Concretes;

import Abstracs.CustomerServices;
import Entities.Customer;

public class BaseCustomerManager implements CustomerServices {

	@Override
	public void save(Customer customer) {
		
		System.out.println("customer saved "+customer.getFirstName());
		
	}

}
