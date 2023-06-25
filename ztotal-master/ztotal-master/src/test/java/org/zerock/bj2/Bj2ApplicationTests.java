package org.zerock.bj2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.bj2.mappers.TimeMapper;

import javax.sql.DataSource;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Bj2ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	TimeMapper timeMapper;

	@Test
	public void testTime() {

		log.info("---------------------");
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());

	}

	@Test
	void contextLoads() {
		log.info("Context Load.....");
	}

	@Test
	public void testConnection(){

		log.info("Test........................");
		// long start = System.currentTimeMillis();
		// for (int i = 0; i < 500; i++) {

		// 	try( java.sql.Connection con = dataSource.getConnection();){

		// 		log.info(con);
				
		// 		con.close();
		// 	}catch(Exception e){
		// 		e.printStackTrace();
		// 	}
		// }
		// long end = System.currentTimeMillis();

		// log.info("==============================");
		// log.info("TIME: " + (end - start));
	}
	@Test
	public void testConnectionManually()throws Exception{


		log.info("Test Connection");
		// Class.forName("com.mysql.cj.jdbc.Driver");

		// long start = System.currentTimeMillis();
		// for (int i = 0; i < 500; i++) {

		// 	try( java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/webdb?serverTimezone=UTC", "webuser", "webuser")
		// 	 ){

		// 		log.info(con);
			
		// 	}catch(Exception e){
		// 		e.printStackTrace();
		// 	}		
		// }
		// long end = System.currentTimeMillis();

		// log.info("==============================");
		// log.info("TIME: " + (end - start));

	}
}
