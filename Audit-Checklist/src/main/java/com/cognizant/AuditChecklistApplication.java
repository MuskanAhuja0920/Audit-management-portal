package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * 
		POD 1 -Audit Management System
 * This is Application class for Spring boot
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class AuditChecklistApplication {
	/**
	 * main Method- SpringBoot main method to launch an application. 
	 */
	public static void main(String[] args) {
		SpringApplication.run(AuditChecklistApplication.class, args);
	}

}
