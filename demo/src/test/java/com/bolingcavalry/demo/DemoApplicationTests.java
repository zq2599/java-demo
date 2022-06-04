package com.bolingcavalry.demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bolingcavalry.demo.entity.Seller;
import com.bolingcavalry.demo.service.SellerService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	SellerService sellerService;

	@Test
	void testGetById() {
		int id = 1;
		Seller seller = sellerService.get(id);
		// 判定非空
        Assertions.assertNotNull(seller);
		// id相等
		Assertions.assertEquals(id, seller.getId());
	}
}
