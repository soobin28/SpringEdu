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
		}, noRollbackFor = {}) // � ���ܰ� �߻����� �� �ѹ��� ���ϰڴٴ� �ǹ�.
public class BuyService {
	@Autowired
	OrderDao oDao;
	@Autowired
	ProductDao pDao;

	public void buy(String memberId, int productId) {
		int result1 = oDao.insertOrder(memberId, productId);
		System.out.println("���ų��� �߰� : " + result1);

		int result2 = pDao.updateProduct(productId);
		System.out.println("��ǰ ���� ���� : " + result2);

//		if (result1 < 1 || result2 < 1) {
//			throw new RuntimeException(); // Runtime ���� �߻��� Rollback
//		}

	}
}