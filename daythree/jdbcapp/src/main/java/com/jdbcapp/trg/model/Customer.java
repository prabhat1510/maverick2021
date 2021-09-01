package com.jdbcapp.trg.model;

import java.time.LocalDate;

public class Customer {
	private Integer customerId;
	private String customerName;
	private LocalDate birthdate;
	private Long mobile;
	private String email;
	
	public Customer() {
		
	}

	public Customer( String customerName, LocalDate birthdate, Long mobile, String email) {
		super();		
		this.customerName = customerName;
		this.birthdate = birthdate;
		this.mobile = mobile;
		this.email = email;
	}
	
	public Customer(Integer customerId, String customerName, LocalDate birthdate, Long mobile, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.birthdate = birthdate;
		this.mobile = mobile;
		this.email = email;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", birthdate=" + birthdate
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
}
