package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpDao;
import com.model.Employee;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao ed;
	
	@Override
	public void addRegisterData(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("in Servce layer : " + employee);
		ed.addRegisterData(employee);
	}

}
