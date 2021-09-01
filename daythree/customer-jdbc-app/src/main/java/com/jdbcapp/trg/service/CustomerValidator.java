package com.jdbcapp.trg.service;

import java.time.LocalDate;

import com.jdbcapp.trg.model.Customer;
/**
 * 
 * @author Srini
 * @version 1.0
 * 
 * This class validates Customer object
 */
public class CustomerValidator {
	/**
	 * 
	 * @param customer
	 * @return true if valid name(only alphabets and spaces) 
	 * else returns false
	 */
	public Boolean isValidCustomerName(Customer customer) {
		String regex= "^[a-zA-Z]+[a-zA-Z. ]*$";
		return customer.getCustomerName().matches(regex);
	}
	
	/**
	 * 
	 * @param customer
	 * @return true if valid birthdate(birthdate< currentdate) name else returns false
	 */
	public Boolean isValidCustomerBirthdate(Customer customer) {
		return customer.getBirthdate().isBefore(LocalDate.now());
	}
	
	/**
	 * 
	 * @param customer
	 * @return true if valid mobile(10-digit number and not a 
	 * service number ex. 9999999999)else returns false
	 */
	public Boolean isValidCustomerMobile(Customer customer) {
		String mobile= customer.getMobile().toString();
		if(mobile.length()==10) {
			char op= mobile.charAt(0);
			int i;
			for(i=1;i<mobile.length();i++) {
				if(op!=mobile.charAt(i)) {
					break;
				}
			}
			if(i<mobile.length()) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param customer
	 * @return true if valid email(xxx@xxx.xxx or 
	 * xxxx@xxx.xxx.xxx) else returns false
	 */
	public Boolean isValidCustomerEmail(Customer customer) {
		String regex= "^[a-zA-Z0-9._]+[@]{1}[a-zA-Z]+([.]{1}[a-zA-Z]{2,3}){1,2}$";
		return customer.getEmail().matches(regex);
	}
	
	/**
	 * @param customer
	 * @return true if customer details are valid else return false
	 */
	public Boolean isValidCustomer(Customer customer) {
		if(this.isValidCustomerName(customer) &&
				this.isValidCustomerBirthdate(customer) &&
				 this.isValidCustomerEmail(customer) &&
				   this.isValidCustomerMobile(customer)) {
			return true;
		}
		return false;
	}
	
	
}
