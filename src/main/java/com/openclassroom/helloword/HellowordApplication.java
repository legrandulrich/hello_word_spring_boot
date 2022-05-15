package com.openclassroom.helloword;

import com.openclassroom.helloword.service.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication implements CommandLineRunner {
    @Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(bs.getHelloWord());

	}

}
