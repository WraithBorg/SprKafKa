package com.zx.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zx")
public class SprProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprProviderApplication.class, args);
	}

}
