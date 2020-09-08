package com.zx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zx")
public class SprConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprConsumerApplication.class, args);
	}

}
