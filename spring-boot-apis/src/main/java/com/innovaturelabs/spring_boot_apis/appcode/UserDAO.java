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
    
//	   public void delete(Integer id) {
//	      String SQL = "delete from STUDENT where id = ?";
//	      jdbcTemplateObject.update(SQL, id);
//	      System.out.println("Deleted Record with ID = " + id );
//	      return;
//	   }
//	   public void update(Integer id, String name, String branch, int percent, int phone, String email){
//	      String SQL = "update STUDENT set NAME = ?,BRANCH=?,PERCENTAGE=?,PHONE=?,EMAIL=? where id = ?";
//	      jdbcTemplateObject.update(SQL,name,branch,percent,phone,email, id);
//	      System.out.println("Updated Record with ID = " + id );
//	      return;
//	   }

}
