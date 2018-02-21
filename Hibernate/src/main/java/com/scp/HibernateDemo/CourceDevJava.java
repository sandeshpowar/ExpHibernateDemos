package com.scp.HibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CourceDevJava implements CourceDao {
	private static final SessionFactory sessionfactory;
	static {
			try {
				sessionfactory=new Configuration().configure().buildSessionFactory();
			}catch(Throwable e){
				System.err.println("Initial SessionFactory creation failed." + e); 
                throw new ExceptionInInitializerError(e);
				
			}
	}

	public void create(List<Cource> listCources) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.openSession(); 
        session.getTransaction().begin();              
        for (Cource course : listCources) { 
        	session.save(course); 
        }              
        session.getTransaction().commit();              

	}

	public List findAll() {
		Session session = sessionfactory.openSession(); 
		List<Cource> list = session.createQuery("From Cource").list(); 
		return list;              
	}

}
