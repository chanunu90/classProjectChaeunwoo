package org.oneteam.oneteam;

import java.io.Console;

import org.junit.jupiter.api.Test;
import org.oneteam.oneteam.mappers.ReplyMapper;
import org.oneteam.oneteam.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class OneteamApplicationTests {


	@Autowired
	TestMapper testMapper;

	@Autowired
	ReplyMapper replyMapper;

	@Test
	void testdb() {

		log.info("---------------------");
		log.info(testMapper.testNow());
	}


	@Test
	void testReply() {

		log.info(replyMapper.boardreplies(1L));
	}


	@Test
	void testReplyInsert() {

		log.info(replyMapper.());
	}


	
}
