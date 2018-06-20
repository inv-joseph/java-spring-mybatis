package com.innovaturelabs.spring_boot_apis.appcode;
import org.springframework.stereotype.Component;

@Component
public class User {
	String name;  
    String email;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
}
