package com.virtusa.model;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javassist.bytecode.Descriptor.Iterator;

public class PersistanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Employee employee = new Employee();
		employee.setEmployeeId(102);
		employee.setFirstName("Rama");
		employee.setLastName("Lakshmi");
		employee.setSalary(20000);
		employee.setAge(21);
		employee.setGender("F");
		Employee employee1 = new Employee();
		employee1.setEmployeeId(103);
		employee1.setFirstName("Ayesha");
		employee1.setLastName("Naaz");
		employee1.setSalary(25000);
		employee1.setAge(22);
		employee1.setGender("M");
		Employee employee2=new Employee();
		employee2.setEmployeeId(104);
		employee2.setFirstName("rehan");
		employee2.setLastName("pathan");
		employee2.setSalary(30000);
		employee2.setAge(1);
		employee2.setGender("M");
		Employee employee3 = new Employee();
		employee3.setEmployeeId(105);
		employee3.setFirstName("sana");
		employee3.setLastName("khan");
		employee3.setSalary(222);
		employee3.setAge(23);
		employee3.setGender("F");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
	//	System.out.println("swyy");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		session.saveOrUpdate(employee);
		session.saveOrUpdate(employee1);
		session.saveOrUpdate(employee2);
		session.saveOrUpdate(employee3);
		//session.refresh(employee);
	    //session.load(employee, 102);
		//System.out.println(session);
		/*Query query=session.createQuery("select count(e.salary) from Employee e");
		List<Long> l=query.list();
		for(Long e:l)
		System.out.println(e);
		*/
		/*Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		Query query=session.createQuery("from Employee e where e.salary=?0");
		query.setInteger(0, x);
		List<Employee> l=query.list();
		for(Employee e:l)
		System.out.println(e);*/
		transaction.commit();
		session.close();

	}

}
