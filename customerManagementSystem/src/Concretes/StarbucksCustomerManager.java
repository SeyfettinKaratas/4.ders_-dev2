package Concretes;

import Abstracs.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private PersonCheckService personCheckService;

	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(personCheckService.checkPerson(customer)) {
			super.save(customer);
		}else {System.out.println("person not exist");}
		
	} 	
}
