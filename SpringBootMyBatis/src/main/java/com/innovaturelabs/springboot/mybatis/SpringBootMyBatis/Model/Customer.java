package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model;

import org.springframework.data.annotation.Id;
public class Customer {
	@Id
    public String id;

    public String name;
    public String email;

    public Customer() {}
    
    public String getId() {  
        return id;  
    }  
    public void setId(String id) {  
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
    
//    public Customer(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']",id, name, email);
    }

}
