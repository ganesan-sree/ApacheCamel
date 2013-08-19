package com.endpoints;

import java.util.Map;
import org.apache.log4j.Logger;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;

import com.model.message.QueuedEvent;

public class SMSEndpoint {
    private final Logger log = Logger.getLogger(SMSEndpoint.class);    
    public void run(@Body Object thing,@Headers Map hdrMap,@OutHeaders Map outHdrs){
    	QueuedEvent qe = (QueuedEvent) thing;
    	qe.setLastChannel("sms");
    	System.out.println("SMS Endpointsssssssssssss\n\n\n");
    }
}
