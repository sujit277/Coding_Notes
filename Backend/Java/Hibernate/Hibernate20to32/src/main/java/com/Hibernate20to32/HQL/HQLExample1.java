package com.Hibernate20to32.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLExample1 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();

		// HQL Select Query Execution
		// String query = "from Student";
		// String query = "from Student where name = 'Sujit'";
		String query = "from Student where name =:x";
		Query q = s.createQuery(query);
		q.setParameter("x", "Sujit");
		List<Student> list = q.list();
		for (Student student : list) {
			System.out.println(student);
		}

		s.close();
		factory.close();
	}
}
