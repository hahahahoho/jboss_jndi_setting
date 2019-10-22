package com.bootwar.config;
 
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
 
@Configuration
public class AppConfiguration {
	
	@Qualifier("db1")
	@Primary
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = null; 
		System.out.println("value of datasource"+dataSource);
		try {
	   
	    Context initialContex = new InitialContext();
	    
	    System.out.println("value of datasource"+dataSource);
	    dataSource = (DataSource)(initialContex.lookup("java:jboss/datasources/cubridTest"));
	    
	    
	    if(dataSource != null) {
	    	dataSource.getConnection();
		    
	    }
	    
		}catch(Exception e) {
			e.printStackTrace();
		}
	   
	    return dataSource;
	}
	@Qualifier("db2")
	@Bean
	public DataSource dataSource2() {
		System.out.println("bean2 생성");
		DataSource dataSource = null; 
		System.out.println("value of datasource"+dataSource);
		try {
	   
	    Context initialContex = new InitialContext();
	    
	    System.out.println("value of datasource"+dataSource);
	    dataSource = (DataSource)(initialContex.lookup("java:jboss/datasources/cubridTest2"));
	    
	    
	    if(dataSource != null) {
	    	dataSource.getConnection();
		    
	    }
	    
		}catch(Exception e) {
			e.printStackTrace();
		}
	   
	    return dataSource;
	}
}