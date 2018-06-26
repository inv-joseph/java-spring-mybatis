package com.innovaturelabs.spring_boot_apis;

import com.innovaturelabs.spring_boot_apis.appcode.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SpringBootJdbcController {
	
	@Autowired
	private IUserService userService;
		
	@RequestMapping(value="/save")  
    public String index(){  
        //jdbc.execute("insert into user(name,email)values('josephinno','joseph@innolabs.com')");
        return "data inserted Successfully";  
    }
	
	@RequestMapping(value="/user/create",method = RequestMethod.POST)  
    public String create(User u){  
		userService.create(u);
        return "User created :"+u.getName();  
    }
	
	@RequestMapping(value="/user/get",method = RequestMethod.GET)  
    public User getUser(Integer id){  
        return userService.getUser(id);  
    }
	
	@RequestMapping(value="/user/get-users",method = RequestMethod.GET)  
    public ResponseEntity<List<User>> listUsers(){  
        List <User> list = userService.listUser();
        return new ResponseEntity<List<User>>(list,HttpStatus.OK);
    }
	
	@RequestMapping(value="/user/delete",method = RequestMethod.POST)  
    public void delete(Integer id){  
        userService.delete(id);
        return;
    }
	
	@RequestMapping(value="/user/update",method = RequestMethod.POST)  
    public void update(Integer id,User u){  
        userService.update(id,u);
        return;
    }
	
}
