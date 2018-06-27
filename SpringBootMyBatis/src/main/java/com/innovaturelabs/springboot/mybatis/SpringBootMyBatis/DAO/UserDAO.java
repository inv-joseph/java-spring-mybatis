package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.DAO;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Util.MyBatisUtil;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers.IUserMapper;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class UserDAO {
	private SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
	
	public User getUser(Integer id) {
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		return mapper.getUser(id); 
	}
	
	public List<User> getUsers() {
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		return mapper.getUsers(); 
	}
	
	public void create(User usr) {
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		mapper.create(usr);
		session.commit();
		session.close();
	}
	
	public void update(User usr) {
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		mapper.update(usr);
		session.commit();
		session.close();
	}
	
	public void delete(Integer id) {
		IUserMapper mapper = session.getMapper(IUserMapper.class);
		mapper.delete(id);
		session.commit();
		session.close();
	}
}
