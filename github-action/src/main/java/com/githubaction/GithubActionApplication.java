package com.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class GithubActionApplication {
	private static Logger logger = Logger.getLogger(GithubActionApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(GithubActionApplication.class, args);

		logger.info("Logging an INFO-level message");
	}
}
