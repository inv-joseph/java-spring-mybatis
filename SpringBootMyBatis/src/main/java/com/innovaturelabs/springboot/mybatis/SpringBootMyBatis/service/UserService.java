package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.service;
import org.springframework.stereotype.Component;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers.IUserMapper;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.DAO.UserDAO;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;

@Component
public class UserService implements IUserMapper {
	private UserDAO userDao;

	public User getUser(Integer userId) {
	  return userDao.getUser(userId);
	}
}
