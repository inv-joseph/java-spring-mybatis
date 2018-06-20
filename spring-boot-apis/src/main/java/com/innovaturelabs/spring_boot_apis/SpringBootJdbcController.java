package com.innovaturelabs.spring_boot_apis;

import com.innovaturelabs.spring_boot_apis.appcode.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RestController
public class SpringBootJdbcController {
	
	@Autowired
	private IUserService userService;    
	
	@RequestMapping(value="/save")  
    public String index(){  
        //jdbc.execute("insert into user(name,email)values('josephinno','joseph@innolabs.com')");
        return "data inserted Successfully";  
    }
	
	@RequestMapping(value="/create")  
    public String create(){  
		User u = new User();
		u.setName("Sada Shiv");
		u.setEmail("sada-shiv@innomail.com");
		
		userService.create(u);
		
        return "data inserted Successfully";  
    }
}
