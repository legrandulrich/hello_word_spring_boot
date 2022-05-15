package com.openclassroom.helloword;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.openclassroom.helloword.service.BusinessService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {

		String expected = "bonjour president";

		String result = bs.getHelloWord().getValue();

		assertEquals(expected, result);
	}

}