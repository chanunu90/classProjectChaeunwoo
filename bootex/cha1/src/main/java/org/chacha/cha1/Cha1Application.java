package org.chacha.cha1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.chacha.cha1.**.mappers")
public class Cha1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cha1Application.class, args);
	}

}
