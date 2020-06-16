package com.First_Spring.AOPMySpring;

import com.First_Spring.AOPMySpring.Business.Business_1;
import com.First_Spring.AOPMySpring.Business.Business_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopMySpringApplication implements CommandLineRunner {

	@Autowired
	Business_1 business_1;

	@Autowired
	Business_2 business_2;

	public static void main(String[] args) {

		SpringApplication.run(AopMySpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println( business_1.business_1_service() );
		System.out.println( business_2.business_2_service() );

	}
}
