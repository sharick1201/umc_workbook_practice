package com.example.umc_workbook_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmcWorkbookPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmcWorkbookPracticeApplication.class, args);
	}

}
