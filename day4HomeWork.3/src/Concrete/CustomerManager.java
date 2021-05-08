package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Welcome : " + customer.getNickName());
		}
		else {
			System.out.println(customer.getFirstName() + " NOT A VALID PERSON");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("User : " + customer.getFirstName() + " DELETED");
		
	}

	@Override
	public void update(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getNickName() + " Update Successfully");
		}
		else {
			System.out.println(customer.getNickName() + " UPDATE FAILED");
		}
		
	}

}
