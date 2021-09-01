package com.jdbcapp.trg.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.jdbcapp.trg.model.Customer;

public class CustomerDaoImpl implements CustomerDAO {
	private Logger daoLogger = Logger.getLogger(CustomerDaoImpl.class);

	@Override
	public Customer getCustomerById(Integer customerId) throws SQLException {
		//try (Connection connection = MySQLDataSource.getMySQLDataSource().getConnection();
				//PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);)
		try (Connection connection =  DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/training", "postgres", "password");	
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);){
			preparedStatement.setInt(1, customerId);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				populateCustomer(customer, resultSet);
				daoLogger.info(customerId + " customer retrieved");
				return customer;
			} else {
				throw new SQLException("Invalid CustomerId");
			}

		} catch (SQLException e) {
			daoLogger.error(e.getMessage(), e);
			// e.printStackTrace();
		} catch (Exception e) {
			daoLogger.error(e.getMessage(), e);
			// e.printStackTrace();
		}
		return null;
	}

	private void populateCustomer(Customer customer, ResultSet resultSet) throws SQLException {
		customer.setCustomerId(resultSet.getInt("customer_id"));
		customer.setCustomerName(resultSet.getString("customer_name"));
		customer.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
		customer.setMobile(resultSet.getLong("mobile"));
		customer.setEmail(resultSet.getString("email"));

	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		//try (Connection connection = MySQLDataSource.getMySQLDataSource().getConnection();
		try (Connection connection =  DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/training", "postgres", "password");	
				Statement statement = connection.createStatement();) {

			ResultSet resultSet = statement.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
			List<Customer> customerList = new ArrayList<>();
			while (resultSet.next()) {
				Customer customer = new Customer();
				populateCustomer(customer, resultSet);
				customerList.add(customer);
			}
			if (customerList.size() > 0) {
				daoLogger.info("Retrieving all customers from database");
				return customerList;
			} else {
				throw new Exception("Customer table is empty");
			}

		} catch (SQLException e) {
			daoLogger.error(e.getMessage(), e);
			// e.printStackTrace();
		} catch (Exception e) {
			daoLogger.error(e.getMessage(), e);
			// e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer addCustomer(Customer customer) throws SQLException {
		//try (Connection connection = MySQLDataSource.getMySQLDataSource().getConnection();
		try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/training", "postgres", "password");		
		     CallableStatement callableStatement = connection.prepareCall(QueryMapper.ADD_CUSTOMER)) {
			callableStatement.setString(1, customer.getCustomerName());
			// convert LocalDate to java.sql.Date
			callableStatement.setDate(2, java.sql.Date.valueOf(customer.getBirthdate()));
			callableStatement.setLong(3, customer.getMobile());
			callableStatement.setString(4, customer.getEmail());
			int n = callableStatement.executeUpdate();
			return n;
		} catch (SQLException e) {
			daoLogger.error(e.getMessage(), e);
			// e.printStackTrace();
		} catch (Exception e) {
			daoLogger.error(e.getMessage(), e);
			// e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer updateCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
