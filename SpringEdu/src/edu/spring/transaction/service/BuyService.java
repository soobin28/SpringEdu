package edu.spring.transaction.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.transaction.dao.OrderDao;
import edu.spring.transaction.dao.ProductDao;

@Service
@Transactional(rollbackFor = { 
		RuntimeException.class, SQLException.class 
		}, noRollbackFor = {}) // 어떤 예외가 발생했을 때 롤백을 안하겠다는 의미.
public class BuyService {
	@Autowired
	OrderDao oDao;
	@Autowired
	ProductDao pDao;

	public void buy(String memberId, int productId) {
		int result1 = oDao.insertOrder(memberId, productId);
		System.out.println("구매내역 추가 : " + result1);

		int result2 = pDao.updateProduct(productId);
		System.out.println("상품 개수 감소 : " + result2);

//		if (result1 < 1 || result2 < 1) {
//			throw new RuntimeException(); // Runtime 예외 발생시 Rollback
//		}

	}
}