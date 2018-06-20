package com.innovaturelabs.spring_boot_apis.appcode;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User usr = new User();
		usr.setName(rs.getString("name"));
		usr.setEmail(rs.getString("branch"));
	    return usr;    
	}
}
