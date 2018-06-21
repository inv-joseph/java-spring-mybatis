package com.innovaturelabs.spring_boot_apis.appcode;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface IUserService {
	boolean create(User user);
	User getUser(Integer id);
	List<User> listUser();
	void delete(Integer id);
	void update(Integer id,User u);
}
