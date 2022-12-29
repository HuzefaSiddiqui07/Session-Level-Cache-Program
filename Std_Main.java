package com.sessionlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Std_Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		// We are using Two Session Objects.
		Student s1 = (Student) session.get(Student.class, 9);

		System.out.println("First Student Data >");
		System.out.println("Name >> " + s1.getName());
		System.out.println("City >> " + s1.getCity());
		System.out.println("Mobile >> " + s1.getMobile());

		Student s2 = (Student) session.get(Student.class, 9);

		System.out.println("Second Student Data >");
		System.out.println("Name >> " + s2.getName());
		System.out.println("City >> " + s2.getCity());
		System.out.println("Mobile >> " + s2.getMobile());

	}

}
