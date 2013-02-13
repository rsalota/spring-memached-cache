package com.openwebsys.simplecache;

import org.springframework.stereotype.Component;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	private static int invocationCount;
	
	/**
	 * Reads next record from input
	 */
	@ReadThroughSingleCache(namespace = "CplxObj", expiration = 3600)
	public String getMessage(@ParameterValueKeyProvider String name) {
		System.out.println(invocationCount++);
		return "rahul";	
	}
	
}
