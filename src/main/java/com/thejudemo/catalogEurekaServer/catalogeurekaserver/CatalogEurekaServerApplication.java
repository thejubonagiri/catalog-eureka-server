package com.thejudemo.catalogEurekaServer.catalogeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CatalogEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogEurekaServerApplication.class, args);
	}

}
