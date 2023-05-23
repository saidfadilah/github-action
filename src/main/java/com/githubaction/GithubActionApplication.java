package com.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;
@RestController
@SpringBootApplication
@RequestMapping(value = "/api")
public class GithubActionApplication {
	private static Logger logger = Logger.getLogger(GithubActionApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);

		logger.info("Logging an INFO-level message");
	}
	@RequestMapping(value = "/{endpoint}", method = RequestMethod.GET)
	String getHello(@PathVariable("endpoint") String endpoint){
		logger.info(endpoint);
		return "Hello Spring Boot";
	}
}
