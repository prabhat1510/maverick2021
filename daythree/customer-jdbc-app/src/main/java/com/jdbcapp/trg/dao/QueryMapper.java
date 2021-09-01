package com.jdbcapp.trg.dao;

public interface QueryMapper {
	public static final String GET_CUSTOMER_BY_ID= 
			"select * from customer where customerid=?";
	public static final String GET_ALL_CUSTOMERS=
			"select * from customer";
	public static final  String ADD_CUSTOMER=
			"{call add_customer(?,?,?,?)}";
	public static final String UPDATE_CUSTOMER=
			"update customer set customername=?,birthdate=?,mobile=?,email=? where customerid=?";
	
	public static final String DELETE_CUSTOMER="delete customer where customerid=?";
}
