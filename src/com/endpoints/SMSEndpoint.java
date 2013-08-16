package com.endpoints;

import java.util.Map;
import org.apache.log4j.Logger;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;

public class SMSEndpoint {
    private final Logger log = Logger.getLogger(SMSEndpoint.class);    
    public void run(@Body Object thing,@Headers Map hdrMap,@OutHeaders Map outHdrs){    
    	log.debug("SMS Endpointsssssssssssss\n\n\n");
    }
}
