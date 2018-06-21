package com.innovaturelabs.spring_boot_apis.appcode;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAO implements IUserDAO{
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public boolean create(User usr) {
		  String SQLQuery = "insert into user(name,email) values (?, ?)";
	      jdbc.update(SQLQuery,usr.getName(),usr.getEmail());
	      return true;
	}
	
	public User getUser(Integer id) {
		String SQL = "select * from user where id = ?";
	    User user = jdbc.queryForObject(SQL, 
	    new Object[]{id}, new UserMapper());  
	    return user;
	}
	
    public List<User> listUser() {
      String SQL = "select * from user";
      List <User> users = jdbc.query(SQL, new UserMapper());
      return users;
    }
    
    public void delete(Integer id) {
      String SQL = "delete from user where id = ?";
      jdbc.update(SQL, id);
      return;
    }
	   
    public void update(Integer id, User u){
    	String SQL = "update user set name = ?,email=? where id = ?";
    	jdbc.update(SQL,u.getName(),u.getEmail(), id);
	    return;
	}

}
