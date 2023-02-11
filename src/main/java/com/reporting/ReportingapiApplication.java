package com.reporting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReportingapiApplication {
	private static final Logger LOGGER =  LoggerFactory.getLogger(ReportingapiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReportingapiApplication.class, args);
		LOGGER.info("Reporting application has been started");
	}
}

