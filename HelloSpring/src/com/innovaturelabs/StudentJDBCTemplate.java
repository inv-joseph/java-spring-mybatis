package com.innovaturelabs;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class StudentJDBCTemplate {
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	   public void create(String name, String branch, int percent, int phone, String email) {
	      String SQL = "insert into STUDENT (NAME, BRANCH, PERCENTAGE, PHONE, EMAIL) values (?, ?, ?, ?, ?)";
	      jdbcTemplateObject.update( SQL, name, branch, percent, phone, email);
	      System.out.println("Created Record Name = " + name + " Age = " + branch);
	      return;
	   }
	   public Student getStudent(Integer id) {
	      String SQL = "select * from STUDENT where id = ?";
	      Student student = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      
	      return student;
	   }
	   public List<Student> listStudents() {
	      String SQL = "select * from STUDENT";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	   }
	   public void delete(Integer id) {
	      String SQL = "delete from STUDENT where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }
	   public void update(Integer id, String name, String branch, int percent, int phone, String email){
	      String SQL = "update STUDENT set NAME = ?,BRANCH=?,PERCENTAGE=?,PHONE=?,EMAIL=? where id = ?";
	      jdbcTemplateObject.update(SQL,name,branch,percent,phone,email, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	   }
}
