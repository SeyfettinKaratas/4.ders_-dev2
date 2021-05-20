import java.time.LocalDate;

import Concretes.BaseCustomerManager;
import Concretes.CustomerCheckManager;
import Concretes.MernisAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("mike");
		customer.setLastName("tyson");
		customer.setNationalIdentity("12345");
		customer.setBirthDate(LocalDate.of(1994, 4, 25));
		
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager( new MernisAdapter());
		baseCustomerManager.save(customer);
		

	}

}
