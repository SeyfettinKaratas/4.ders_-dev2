package Concretes;

import Abstracs.PersonCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private PersonCheckService personCheckService;

	public NeroCustomerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(personCheckService.checkPerson(customer)) {
			super.save(customer);
		}else {System.out.println("person exist");}
		
}
}
