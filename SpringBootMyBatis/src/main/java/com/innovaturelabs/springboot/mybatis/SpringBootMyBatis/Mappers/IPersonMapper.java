package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Mappers;
import java.util.List;
import com.innovaturelabs.springboot.mybatis.SpringBootMyBatis.Model.Person;

public interface IPersonMapper {
	
	public void save(Person p);
	public List<Person> list();

}
