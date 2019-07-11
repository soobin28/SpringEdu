package edu.spring.transaction.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:edu/spring/transaction/service/config.xml" })
public class BuyServiceTest {
	@Autowired
	BuyService bs;
	
	@Test
	public void select() {
		// bs.buy(구매자아이디, 상품아이디);
		bs.buy("a", 1);
		// 가입되어 있는 회원 ID, 등록되어 있는 상품 ID
		
	}
}
