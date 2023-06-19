package org.oneteam.oneteam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.oneteam.oneteam.**.mappers"})
public class OneteamApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneteamApplication.class, args);
	}

}
