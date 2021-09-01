
package com.jdbcapp.trg.dao;
/**
import com.jdbcapp.trg.model.Customer;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDataImpl {

    private Logger daoLogger = Logger.getLogger(CustomerDataImpl.class);
    public Customer getCustomerById(Integer customerId) throws SQLException {
        //try (Connection connection = MySQLDataSource.getMySQLDataSource().getConnection();
        //PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);)
        //try (Connection connection =  DriverManager.getConnection(
          //      "jdbc:postgresql://127.0.0.1:5432/training", "postgres", "password");
        Connection connection =null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            connection =DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/maveric", "postgres", "password")
            preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, customerId);
            resultSet = preparedStatement.executeQuery();
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
        }finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
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
}
**/