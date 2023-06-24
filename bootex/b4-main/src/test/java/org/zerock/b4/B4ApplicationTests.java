package org.zerock.b4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.zerock.b4.dto.ProductListDTO;
import org.zerock.b4.dto.ProductRegisterDTO;

@SpringBootTest
@Commit
class B4ApplicationTests {

	@Autowired
	ProductListDTO productListDTO;

	@Autowired
	ProductRegisterDTO productRegisterDTO;

	


	void testInsert(){

	}



	@Test
	void contextLoads() {
	}


	@Test
	void start(){



	}


}
