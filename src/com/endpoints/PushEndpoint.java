package com.endpoints;

import java.util.Map;


import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.log4j.Logger;


public class PushEndpoint  {
	

	private final static Logger log = Logger.getLogger(PushEndpoint.class);
	
	public void route(@Body Object thing, @Headers Map hdrMap,@OutHeaders Map outHdrs) {
		System.out.println("PUSH Endpointsssssssssssss\n\n\n");	
	}

	
}