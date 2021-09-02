package com.jdbcapp.trg.dao;

import com.jdbcapp.trg.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
	public Customer getCustomerById(Integer customerId) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public Integer addCustomer(Customer customer) throws SQLException;
	public Integer updateCustomer(Customer customer) throws SQLException;
	public Integer deleteCustomer(Integer customerId) throws SQLException;
	public List<Customer> getCustomers() throws SQLException;
}
