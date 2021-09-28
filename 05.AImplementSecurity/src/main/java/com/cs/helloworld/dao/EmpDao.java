package com.cs.helloworld.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.cs.helloworld.domain.Emp;


@Repository
public class EmpDao {
	ArrayList<Emp> emps = new ArrayList<Emp>();
	
	public EmpDao(){
		this.emps.add(new Emp(1,"John"));
		this.emps.add(new Emp(2,"Michael"));
	}
	
	public ArrayList<Emp> getAllEmps(){
		return this.emps;
	}
	
	public ArrayList<Emp> insertEmp(Emp e){
		this.emps.add(e);
		return this.emps;
	}
		
	
}
