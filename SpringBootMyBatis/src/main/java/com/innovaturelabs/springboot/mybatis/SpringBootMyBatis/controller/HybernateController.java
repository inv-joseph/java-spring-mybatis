package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.Person;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers.IPersonMapper;
import org.hibernate.Session; 
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

@RestController
public class HybernateController {
	@RequestMapping(value="/hiber/index")  
    public String insertUser(User usr){
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		session.save(usr);
		t.commit();
		factory.close();
		session.close();
		
		return "----- Person hibernated successfully -----";
    }
	
	@RequestMapping(value="/hiber/list")  
    public String getUsers(){
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/home/joseph/eclipse-workspace/SpringBootMyBatis/src/main/resources/Beans.xml");
//		
//		IPersonMapper personMap = context.getBean(IPersonMapper.class);
//		
//		Person person = new Person();
//		person.setName("Miroslove Klose"); 
//		person.setCountry("Germany");
//		personMap.save(person);
//		
		return "----- Person hibernated successfully -----";
    }
}
