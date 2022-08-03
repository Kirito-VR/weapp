package com.example.weapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
class WeappApplicationTests {


	@Test
	void contextLoads() {
	}

	@Bean

	public RestTemplate init(){
		return new RestTemplate();
	}

}
