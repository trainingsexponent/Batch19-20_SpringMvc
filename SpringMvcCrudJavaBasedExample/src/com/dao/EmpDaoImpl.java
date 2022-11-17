package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmpDaoImpl implements EmpDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addRegisterData(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("In Dao Layer : " + employee);
		Session session = sf.openSession();
		session.save(employee);
		session.beginTransaction().commit();
		System.out.println("Data Inserted");
	}

}
