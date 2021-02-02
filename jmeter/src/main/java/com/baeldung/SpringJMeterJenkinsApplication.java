package com.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@Import({ApplicationConfig.class})
@EnableMongoRepositories
public class SpringJMeterJenkinsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringJMeterJenkinsApplication.class, args);
	}
}
