package com.innovaturelabs.springboot.mybatis.SpringBootMyBatis;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"com.innovaturelabs.springboot.mybatis.SpringBootMyBatis"})
public class SpringBootMain {
	public static void main( String[] args )
    {
		SpringApplication.run(SpringBootMain.class, args);
		System.out.println("--------------Application started successfully--------------");  
        //System.out.println( "Hello World!" );
    }
}
