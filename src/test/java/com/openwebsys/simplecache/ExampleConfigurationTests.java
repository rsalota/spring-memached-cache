package com.openwebsys.simplecache;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import com.openwebsys.simplecache.Service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleConfigurationTests {
	
	@Autowired
	private Service service;

	@Test
	public void testSimpleProperties() throws Exception {
		assertNotNull(service);
		for ( int i=0;i<100;i++){
			
			System.out.println("value " + i);
			service.getMessage("rahul");
		}
	}
	
}
