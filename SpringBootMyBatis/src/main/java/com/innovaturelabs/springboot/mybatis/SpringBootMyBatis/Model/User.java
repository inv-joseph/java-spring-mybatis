package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model;
import org.springframework.stereotype.Component;

@Component
public class User {
	Integer id;
	String name;  
    String email;
    public Integer getId() {  
        return id;  
    }  
    public void setId(Integer id) {  
        this.id = id;  
    }
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
