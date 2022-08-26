package com.in30minutes.loans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(value={"com.in30minutes.loans.repository"})
@EntityScan(value={"com.in30minutes.loans.model"})
public class LoansApplication {
	
 static Logger logger= LoggerFactory.getLogger(LoansApplication.class);

	public static void main(String[] args) {
		logger.info("Loans application main method:::");
		SpringApplication.run(LoansApplication.class, args);
	}

}
