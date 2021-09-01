package com.jdbcapp.trg.service;

import java.sql.SQLException;
import java.util.List;

import com.jdbcapp.trg.dao.CustomerDAO;
import com.jdbcapp.trg.dao.CustomerDaoImpl;
import com.jdbcapp.trg.exception.CustomerException;
import com.jdbcapp.trg.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDAO customerDAO= new CustomerDaoImpl();
	
	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		
		try {
			Customer customer=customerDAO.getCustomerById(customerId);
			//To apply business rules
			return customer;
		}catch(SQLException e) {
			throw new CustomerException("SQLException trapped in Service Layer: "+e.getMessage(),e);
		}catch(Exception e) {
			throw new CustomerException("Exception trapped in Service Layer: "+e.getMessage(),e);
		}
		
	}

	@Override
	public List<Customer> getAllCustomers() throws CustomerException {
		try {			
			//To apply business rules
			return customerDAO.getAllCustomers();
		}catch(SQLException e) {
			throw new CustomerException("SQLException trapped in Service Layer: "+e.getMessage(),e);
		}catch(Exception e) {
			throw new CustomerException("Exception trapped in Service Layer: "+e.getMessage(),e);
		}
	}

	@Override
	public Integer addCustomer(Customer customer) throws CustomerException {
		try {			
			//To apply business rules
			CustomerValidator validator= new CustomerValidator();
			if(validator.isValidCustomer(customer)) {
				return customerDAO.addCustomer(customer);
			}else {
				throw new CustomerException("Customer Validation Failed");
			}
			
		}catch(SQLException e) {
			throw new CustomerException("SQLException trapped in Service Layer: "+e.getMessage(),e);
		}catch(Exception e) {
			throw new CustomerException("Exception trapped in Service Layer: "+e.getMessage(),e);
		}
	}

	@Override
	public Integer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
