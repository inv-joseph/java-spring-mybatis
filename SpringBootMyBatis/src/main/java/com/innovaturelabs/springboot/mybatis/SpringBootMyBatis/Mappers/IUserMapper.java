package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers;

import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.apache.ibatis.annotations.Param;

@Component
public interface IUserMapper {
	@Select("SELECT * FROM user WHERE id = #{userId}")
	User getUser(@Param("userId") Integer userId);
}
