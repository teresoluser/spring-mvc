package com.mvcCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModelAndView1Application {

	public static void main(String[] args) {
		SpringApplication.run(ModelAndView1Application.class, args);
		System.out.println( 12>>1);
	}

}
