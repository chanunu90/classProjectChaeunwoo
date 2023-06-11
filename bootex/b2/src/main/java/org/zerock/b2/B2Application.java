package org.zerock.b2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.zerock.bj2.**.mappers"})
public class B2Application {

	public static void main(String[] args) {
		SpringApplication.run(B2Application.class, args);
	}

}