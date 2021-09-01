package com.jdbcapp.trg.service;

import java.util.List;

import com.jdbcapp.trg.exception.CustomerException;
import com.jdbcapp.trg.model.Customer;

public interface CustomerService {
	public abstract Customer getCustomerById(Integer customerId) throws CustomerException;
	public abstract List<Customer> getAllCustomers() throws CustomerException;
	public abstract Integer addCustomer(Customer customer) throws CustomerException;
	public abstract Integer updateCustomer(Customer customer) throws CustomerException;
	public abstract Integer deleteCustomer(Integer customerId) throws CustomerException; 
}
