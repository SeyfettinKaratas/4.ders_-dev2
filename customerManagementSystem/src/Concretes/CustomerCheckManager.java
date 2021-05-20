package Concretes;

import Abstracs.PersonCheckService;
import Entities.Customer;

public class CustomerCheckManager  implements PersonCheckService{

	@Override
	public boolean checkPerson(Customer customer) {
		
		
		return true;
	}

}
