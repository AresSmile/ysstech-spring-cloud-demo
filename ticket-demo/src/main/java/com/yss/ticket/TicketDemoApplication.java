package com.yss.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TicketDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketDemoApplication.class, args);
	}

}
