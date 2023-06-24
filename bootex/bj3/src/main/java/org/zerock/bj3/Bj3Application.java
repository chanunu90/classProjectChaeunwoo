package org.zerock.bj3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.zerock.bj3.**.mappers"})
public class Bj3Application {

	public static void main(String[] args) {
		SpringApplication.run(Bj3Application.class, args);
	}

}
