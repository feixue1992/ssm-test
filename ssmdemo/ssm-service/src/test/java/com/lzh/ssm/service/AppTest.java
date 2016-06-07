package com.lzh.ssm.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context-dao.xml", "classpath:application-context-service.xml", "classpath:application-context-transaction.xml"})
public class AppTest {
	
	@Autowired
	private UserService userService;
	
	@Test
    public void select() {
    	Assert.assertNotNull(userService);
		userService.selectByPrimaryKey(1);
    }
}