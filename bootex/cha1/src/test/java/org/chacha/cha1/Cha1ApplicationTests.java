package org.chacha.cha1;

import org.chacha.cha1.mappers.Boader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Cha1ApplicationTests {

	@Autowired
	Boader border;

	// @Autowired
	// Dto dto;

	@Test
	void contextLoads() {
	}

	@Test
	public void testTime() {

		log.info("---------------------");
		log.info(border.getTimn());

	}

	@Test 
	void selectTest(){

		log.info("-------------------------------------------------------------------------------------");

		// dto.builder()
		// .pno(9)
		// .build();

		// Dto result = border.select();
		log.info(border.select());

		log.info("=============================================================");

		
		// result = border.select(dto);
		// log.info(result);
	}



}
