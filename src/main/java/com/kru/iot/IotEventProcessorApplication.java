package com.kru.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IotEventProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotEventProcessorApplication.class, args);
	}

}
