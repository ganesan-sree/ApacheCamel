package com.endpoints;


import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.log4j.Logger;


public class HL7Endpoint  {
	
	
private final Logger log = Logger.getLogger(HL7Endpoint.class);

    public void run(@Body Object thing,@Headers Map hdrMap,@OutHeaders Map outHdrs){
    	    	
		 log.debug("HL7 Endpointsssssssssssss\n\n\n");	      						
    }
  
}
