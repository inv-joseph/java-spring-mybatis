package com.innovaturelabs.spring_boot_apis;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.innovaturelabs.spring_boot_apis","com.innovaturelabs.spring_boot_apis.appcode"})
public class SpringBootStart {
	public static void main( String[] args )
    {
		SpringApplication.run(SpringBootStart.class, args);
		System.out.println("Application started successfully");  
        //System.out.println( "Hello World!" );
    }
}
