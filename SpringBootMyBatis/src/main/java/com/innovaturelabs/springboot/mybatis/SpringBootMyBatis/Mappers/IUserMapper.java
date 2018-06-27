package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers;
import java.util.List;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Update;

import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Param;

@Component
public interface IUserMapper {
	
	@Select("SELECT * FROM user WHERE id = #{userId}")
	User getUser(@Param("userId") Integer userId);
	
	@Insert("insert into user(name,email) values (#{name}, #{email})")
	void create(User user);
	
	@Update("update user set name=#{name},email=#{email} where id=#{id}")
	void update(User user);
	
	@Delete("delete from user where id=#{id}")
	void delete(Integer id);
	
	@Select("SELECT * FROM user")
	List<User> getUsers();
}
