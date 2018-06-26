package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers;
import java.util.List;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.*;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	void insertUser(User user);
	
	@Select("SELECT * FROM user WHERE id = #{userId}")
    User findUserById(@Param("userId") Integer userId);
	
    List<User> findAllUsers();
}
