package com.virtusa.hibernatepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.setCompany("virtusa");
		e.setName("laxmi");
		e.setId(126);
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(e);
	
		
		session.delete(e);
		transaction.commit();
		session.close();
		
		
	}

}
