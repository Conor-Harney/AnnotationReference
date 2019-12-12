package com.springExample.springbootSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringbootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleApplication.class, args);
	}

}
