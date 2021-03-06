package com.innovaturelabs;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.innovaturelabs.StudentJDBCTemplate;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//    
//    HelloSpring objA = (HelloSpring) context.getBean("helloSpring");
//    objA.getMessage1();
//    objA.getMessage2();
//
//    HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
//    objB.getMessage1();
//    objB.getMessage2();
//    objB.getMessage3();
	
//	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//    JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
//
//    jc.getAddressList();
//    jc.getAddressSet();
//    jc.getAddressMap();
//    jc.getAddressProp();
	
	
	StudentJDBCTemplate studentJDBCTemplate = 
	         (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
	
	// CRUD Oeration
	studentJDBCTemplate.create("Zara Dhivakaran", "NOT-IT", 95, 999855541, "joseph@temple.com");
	
	//Student st = studentJDBCTemplate.getStudent(4);
	
	//List<Student> st_list = studentJDBCTemplate.listStudents();
	
	//studentJDBCTemplate.update(3,"Dharam Raj", "SHIP-WOOD", 75, 999855000, "dharam@tetete.com");
	
	//studentJDBCTemplate.delete(3);
	
	
	System.out.println("------Record Updated --------\n");
    
   }
}
