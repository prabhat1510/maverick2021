package com.cs.helloworld.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cs.helloworld.dao.EmpDao;
import com.cs.helloworld.domain.Emp;
import com.cs.helloworld.services.EmpService;



@RestController
public class EmpController {
	
	@Autowired
	EmpService eservice;
	
	//Sending Data to client and Content Negotiation using Accept header
	@RequestMapping(value="/emps", produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ArrayList<Emp> printEmp(){
		return eservice.getAllEmps();
	}
	
	//Receiving data from client
	@RequestMapping(value="/emps", method=RequestMethod.POST)
	public ArrayList<Emp> addEmp(@RequestBody Emp e){
		return eservice.insertEmp(e);
	}
	
	
}
