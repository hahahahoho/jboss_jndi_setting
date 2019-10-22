package com.bootwar.main;
 
 
 
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
 
@ComponentScan(basePackages="com.bootwar.*")
@SpringBootApplication
public class SpringMain extends SpringBootServletInitializer{
	
	@Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringMain.class);
    }
 
	public static void main(String[] args) {
		System.out.println("bean2");
        SpringApplication.run(SpringMain.class, args);
    }
	
	
	
	
	
}