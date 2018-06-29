package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.MongoMapper.ICustomerRepository;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.Customer;
import java.util.List;

@RestController
public class MongoDBController {
	
	@Autowired
	private ICustomerRepository repository;
	
	@RequestMapping(value="/customer/create")  
    public String insertCustomer(Customer cust){
		repository.insert(cust);
		return "User created successfully";
    }
	
	@RequestMapping(value="/customer/save")  
    public String saveCustomer(Customer cust){
		repository.insert(cust);
		return "User updated successfully";
    }
	
	@RequestMapping(value="/customer/remove",method = RequestMethod.POST)  
    public String removeCustomer(String id){
		repository.delete(id);
		return "User deleted successfully";
    }
		
	@RequestMapping(value="/customer")  
    public Customer getCustomer(){
		return repository.findByName("Alice Smith");
    }
	
	@RequestMapping(value="/customer/list")  
    public List<Customer> getCustomers(){
		return repository.findAll();
    }
}
