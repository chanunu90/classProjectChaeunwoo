package org.oneteam.oneteam;

import java.io.Console;

import org.junit.jupiter.api.Test;
import org.oneteam.oneteam.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class OneteamApplicationTests {


	@Autowired
	TestMapper testMapper;

	@Test
	void testdb() {

		log.info("---------------------");
		log.info(testMapper.testNow());
	}


	
}
