package com.cs.helloworld.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cs.helloworld.dao.EmpDao;
import com.cs.helloworld.domain.Emp;

@Service
public class EmpService {
	@Autowired
	EmpDao edao;
	
	public ArrayList<Emp> getAllEmps() {
		return edao.getAllEmps();
	}

	public ArrayList<Emp> insertEmp(Emp e) {
		return edao.insertEmp(e);
	}
}
