package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.DAO.UserDAO;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;

//import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.service.UserService;
@RestController
public class MyBatisController {
	
//	@Autowired
	//private UserService userService;
	
	@RequestMapping(value="/index")  
    public String index(){  
        return "Controller successfully started";  
    }
	
	@RequestMapping(value="/user/get",method = RequestMethod.GET)  
    public User getUser(Integer id){
		UserDAO uDao = new UserDAO();		
		return uDao.getUser(id);
    }
	
	@RequestMapping(value="/user/list",method = RequestMethod.GET)  
    public List<User> getUsers(){
		UserDAO uDao = new UserDAO();		
		return uDao.getUsers();
    }
	
	@RequestMapping(value="/user/create",method = RequestMethod.POST)  
    public void insertUser(User user){
		UserDAO uDao = new UserDAO();		
		uDao.create(user);
    }
	
	@RequestMapping(value="/user/update",method = RequestMethod.POST)  
    public void updateUser(User user){
		UserDAO uDao = new UserDAO();		
		uDao.update(user);
    }
	
}
