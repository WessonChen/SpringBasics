package com.example.SpringBasics.scope;

import com.example.SpringBasics.basics.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
@ComponentScans({
		@ComponentScan(basePackageClasses = BinarySearchImpl.class)
})
public class SpringBasicsScopeApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicsScopeApplication.class, args);

		PersonDAO personDAO =
				applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO1 =
				applicationContext.getBean(PersonDAO.class);

		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {1, 2, 3}, 0);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());

		LOGGER.info("{}", result);
	}
}
