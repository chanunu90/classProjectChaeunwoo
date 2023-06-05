package org.zerock.b2;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b2.mappers.TimeMapper;

import javax.sql.DataSource;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
@MapperScan(basePackages = {"org.zerock.b2.mappers"})
class B2ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
		log.info("Context Load......");
	}

	@Autowired
	TimeMapper timeMapper;

	@Test
	public void testTime(){
		log.info(timeMapper.getTime());
	}

	@Test
	public void testConnection() {
		try( java.sql.Connection con = dataSource.getConnection() ){

		}catch(Exception e){

		}
	}


}
