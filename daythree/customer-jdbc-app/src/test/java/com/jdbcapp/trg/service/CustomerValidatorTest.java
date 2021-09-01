/**package com.jdbcapp.trg.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jdbcapp.trg.model.Customer;
import com.jdbcapp.trg.service.CustomerValidator;

public class CustomerValidatorTest {
	private static Customer customer;
	private static CustomerValidator validator;

	@BeforeClass
	public static void beforeClass() {
		validator = new CustomerValidator();
		customer = new Customer();
	}

	@AfterClass
	public static void afterClass() {
		validator = null;
		customer = null;
	}

	@Test
	public void isValidCustomerName() {
		customer.setCustomerName("Smith");
		assertTrue(validator.isValidCustomerName(customer));

	}

	@Test
	public void isNotValidCustomerName() {
		customer.setCustomerName("Smith123");
		assertFalse(validator.isValidCustomerName(customer));

	}

	@Test
	public void isValidCustomerBirthdate() {
		customer.setBirthdate(LocalDate.of(1996, 10, 15));
		assertTrue(validator.isValidCustomerBirthdate(customer));

	}

	@Test
	public void isNotValidCustomerBirthdate() {
		customer.setBirthdate(LocalDate.of(2020, 10, 15));
		assertFalse(validator.isValidCustomerBirthdate(customer));

	}

	@Test
	public void isValidCustomerMobile() {
		customer.setMobile(9878989890L);
		assertTrue(validator.isValidCustomerMobile(customer));

	}

	@Test
	public void isNotValidCustomerMobile() {
		customer.setMobile(9999999999L);
		assertFalse(validator.isValidCustomerMobile(customer));

	}

	@Test
	public void isValidCustomerEmail() {
		customer.setEmail("smith@gmail.com");
		assertTrue(validator.isValidCustomerEmail(customer));

	}

	@Test
	public void isNotValidCustomerEmail() {
		customer.setEmail("Smith");
		assertFalse(validator.isValidCustomerEmail(customer));

	}

	@Test
	public void isValidCustomer() {
		Customer customer = new Customer(1, "Smith", LocalDate.of(1990, 10, 15), 9876787678L, "smith@gmail.com");
		assertTrue(validator.isValidCustomer(customer));

	}

	@Test
	public void isNotValidCustomer() {
		Customer customer = new Customer(1, "Smith123", LocalDate.of(2020, 10, 15), 9999999999L, "smith@gmail");
		assertFalse(validator.isValidCustomer(customer));

	}

}**/
