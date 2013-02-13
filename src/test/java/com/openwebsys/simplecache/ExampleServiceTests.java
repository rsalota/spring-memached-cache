package com.openwebsys.simplecache;

import com.openwebsys.simplecache.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();
	
	public void testReadOnce() throws Exception {
		assertEquals("Hello world! rahul", service.getMessage("rahul"));
		assertEquals("Hello world! rahul", service.getMessage("rahul"));
	}

}
