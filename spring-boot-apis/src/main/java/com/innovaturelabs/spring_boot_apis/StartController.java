package com.innovaturelabs.spring_boot_apis;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
	@RequestMapping("/start")  
    public String start(){  
        return "Hello FROM START Controller!";  
    } 
}
