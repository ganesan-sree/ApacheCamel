package com.endpoints;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.log4j.Logger;

public class EmailEndpoint{
	
	private final static Logger log = Logger.getLogger(EmailEndpoint.class);

	public void run(@Body Object thing, @Headers Map hdrMap,@OutHeaders Map outHdrs) {
		log.debug("EMAIL Endpointsssssssssssss\n\n\n");		
	}
}