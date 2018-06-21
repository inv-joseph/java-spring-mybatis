package com.innovaturelabs.spring_boot_apis.appcode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserService implements IUserService {
	@Autowired
	private IUserDAO usrDAO;
	
	@Override
	public synchronized boolean create(User user) {
		usrDAO.create(user);
		return true;
	}
	
	@Override
	public User getUser(Integer id) {
		return usrDAO.getUser(id);
	}
	
	@Override
	public List<User> listUser() {
		return usrDAO.listUser();
	}
}
