package com.example.Book_my_Show_Application_February;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BookMyShow_BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShow_BackendApplication.class, args);
	}

}
