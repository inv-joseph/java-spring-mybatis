package com.innovaturelabs.spring_boot_apis.appcode;

import org.springframework.stereotype.Component;

@Component
public interface IUserDAO {
	boolean create(User user);
}