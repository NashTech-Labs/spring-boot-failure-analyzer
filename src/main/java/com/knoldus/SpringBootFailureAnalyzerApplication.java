package com.knoldus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootFailureAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFailureAnalyzerApplication.class, args);
	}
}