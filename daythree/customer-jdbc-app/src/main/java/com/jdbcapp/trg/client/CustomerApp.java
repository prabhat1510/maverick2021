package com.jdbcapp.trg.client;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.jdbcapp.trg.exception.CustomerException;
import com.jdbcapp.trg.model.Customer;
import com.jdbcapp.trg.service.CustomerService;
import com.jdbcapp.trg.service.CustomerServiceImpl;

public class CustomerApp {
	private static Scanner scanner=new Scanner(System.in);
	private static CustomerService customerService= new CustomerServiceImpl();
	private static Logger uiLogger= 
								Logger.getLogger(CustomerApp.class);
	public static void main( String[] args )    {
		boolean flag=true;
		try {
			while(flag) {
				System.out.println("Enter 1. get customer 2. get all customers 3. add customer 4. update customer 5. delete customer 6. exit");
				int option= Integer.parseInt(scanner.nextLine());
				switch(option) {
				case 1: System.out.println("Enter customer id: ");
						int customerId= Integer.parseInt(scanner.nextLine());
						Customer customer= getCustomerById(customerId);
						if(customer!=null) {
							System.out.println(customer);
						}else {
							throw new CustomerException("Invalid Id: "+customerId );
						}
						break;
				case 2: List<Customer> customerList=
												customerService.getAllCustomers();
						customerList.stream().forEach(System.out::println);
						break;
				case 3: Customer customerNew= new Customer();
					    populateCustomer(customerNew);
					    int n= customerService.addCustomer(customerNew);
					    if(n>0) {
					    	System.out.println("New customer added to database");
					    }else {
					    	System.out.println("Unable to add customer to database");
					    }
					    break;
				case 6: flag=false;break;
				default: flag=false;break;
				}
				
			}
			System.out.println("****END**** ");
		}catch(CustomerException e) {
			uiLogger.error(e.getMessage(), e);
			//e.printStackTrace();
		}
	}

	private static void populateCustomer(Customer customerNew) {
		System.out.println("Enter customer name: ");
		customerNew.setCustomerName(scanner.nextLine());
		System.out.println("Enter birthdate:(yyyy-mm-dd) ");
		String bdate= scanner.nextLine();
		//convert String to LocalDate		
		customerNew.setBirthdate(LocalDate.parse(bdate));
		System.out.println("Enter 10-digit mobile number: ");
		customerNew.setMobile(Long.parseLong(scanner.nextLine()));
		System.out.println("Enter emailId: ");
		customerNew.setEmail(scanner.nextLine());
	}

	private static Customer getCustomerById(int customerId) throws CustomerException {		
		return customerService.getCustomerById(customerId);
	}
}
