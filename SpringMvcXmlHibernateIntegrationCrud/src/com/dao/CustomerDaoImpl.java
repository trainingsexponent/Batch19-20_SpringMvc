package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("In Dao Layer : " + customer);
		Session session = sf.openSession();
		session.save(customer);
		session.beginTransaction().commit();
	}

	@Override
	public List<Customer> getAllData(String uname,String pass) {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<Customer>();
		Session session = sf.openSession();
		if(uname.equals("admin") && pass.equals("admin")) {
			Query<Customer> query = session.createQuery("from Customer");
			 list = query.getResultList();
		}
		
		return list;
	}

}
