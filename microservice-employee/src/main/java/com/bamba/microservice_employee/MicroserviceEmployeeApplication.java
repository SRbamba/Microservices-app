package com.bamba.microservice_employee;

import jakarta.websocket.ClientEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEmployeeApplication.class, args);
	}

}
