package com.sngular.example.springcloudconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigurationApplication.class, args);
	}

}
