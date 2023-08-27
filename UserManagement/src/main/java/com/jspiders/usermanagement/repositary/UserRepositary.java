package com.jspiders.usermanagement.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.jspiders.usermanagement.component.User;

@Repository
public class UserRepositary {

//	public void saveUser1(User u) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("userId");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.persist(u);
//		em.persist(u);
//		et.commit();
//		
//	}

	public void saveUser2(User u2) {
		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration().configure()
				.addAnnotatedClass(User.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tra=sess.beginTransaction();
//		sess.save(u2);
//		tra.commit();
		Query<User> query=sess.createNativeQuery("select * from user",User.class);
		List<User> list=query.list();
		for(User u:list) {
			System.out.println(u);
		}
	}

}