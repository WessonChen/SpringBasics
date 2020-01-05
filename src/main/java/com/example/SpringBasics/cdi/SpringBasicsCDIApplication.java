package com.example.SpringBasics.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBasicsCDIApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringBasicsCDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicsCDIApplication.class, args);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao - {}", business, business.getSomeCDIDAO());
	}
}
