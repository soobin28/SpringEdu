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
		// bs.buy(�����ھ��̵�, ��ǰ���̵�);
		bs.buy("a", 1);
		// ���ԵǾ� �ִ� ȸ�� ID, ��ϵǾ� �ִ� ��ǰ ID
		
	}
}
