package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.DAO;

import java.util.List;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers.IPersonMapper;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonDAO implements IPersonMapper {
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	@Override
	public void save(Person p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> list() {
		Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}
}
