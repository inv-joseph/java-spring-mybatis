package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.MongoMapper;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.Customer;
import java.util.List;

public interface ICustomerRepository extends MongoRepository<Customer, String> {
	 
	 public Customer findByName(String name);
	 public List<Customer> findByEmail(String email);
}
