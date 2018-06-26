package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.DAO.UserDAO;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.service.UserService;
@RestController
public class MyBatisController {
	
//	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index")  
    public String index(){  
        return "Controller successfully started";  
    }
	
	@RequestMapping(value="/user/get",method = RequestMethod.GET)  
    public User getUser(){
		UserDAO uDao = new UserDAO();
		
		return uDao.getUser(1);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/Beans.xml");
//		IUserMapper myMapper =  (IUserMapper) context.getBean("userMapper");
//      return myMapper.getUser(1);  
		//return userService.getUser(1);
    }
	
}
