package com.springsecurity.springsecurityexample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springsecurity.springsecurityexample.repository")
public class SpringsecurityexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityexampleApplication.class, args);
/**
		Customer customer;
		customer.getCustId();
		customer.getCustName();
		customer.setCustId(15);
		customer.setCustName("Mani and Vijay");

 **/
	}

}
