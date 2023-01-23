package com.serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //ye anotaion isliye liye taki isko server bana sake or ye client na ban jaye
//iske liye hum application properties me resition lagate h
public class ServiceRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
