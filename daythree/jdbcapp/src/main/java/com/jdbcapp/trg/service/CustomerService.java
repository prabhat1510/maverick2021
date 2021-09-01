package com.jdbcapp.trg.service;

import com.jdbcapp.trg.exception.CustomerException;
import com.jdbcapp.trg.model.Customer;

import java.util.List;

public interface CustomerService {
	public abstract Customer getCustomerById(Integer customerId) throws CustomerException;
	public abstract List<Customer> getAllCustomers() throws CustomerException;
	public abstract Integer addCustomer(Customer customer) throws CustomerException;
	public abstract Integer updateCustomer(Customer customer) throws CustomerException;
	public abstract Integer deleteCustomer(Integer customerId) throws CustomerException; 
}
