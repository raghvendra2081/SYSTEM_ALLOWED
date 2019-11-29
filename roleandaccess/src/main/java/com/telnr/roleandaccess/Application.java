package com.telnr.roleandaccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Raghvendra S Tyagi
 * Application.java
 * Nov 10, 2019
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
		System.out.println(System.getProperty("user.digi") );
		
	}

}
