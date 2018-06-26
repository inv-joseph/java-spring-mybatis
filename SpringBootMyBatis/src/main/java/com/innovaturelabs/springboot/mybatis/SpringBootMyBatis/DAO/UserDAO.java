package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.DAO;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Util.MyBatisUtil;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers.IUserMapper;
import org.apache.ibatis.session.SqlSession;

public class UserDAO {
	
	public User getUser(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  IUserMapper mapper = session.getMapper(IUserMapper.class);
		  return mapper.getUser(id); 
	}
}
