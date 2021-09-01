package com.jdbcapp.trg.dao;

import java.sql.SQLException;
import java.util.List;

import com.jdbcapp.trg.model.Customer;

public interface CustomerDAO {
	public abstract Customer getCustomerById(Integer customerId) throws SQLException;
	public abstract List<Customer> getAllCustomers() throws SQLException;
	public abstract Integer addCustomer(Customer customer) throws SQLException;
	public abstract Integer updateCustomer(Customer customer) throws SQLException;
	public abstract Integer deleteCustomer(Integer customerId) throws SQLException; 
}
