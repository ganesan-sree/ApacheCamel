package com.endpoints;

import java.util.Map;
import org.apache.log4j.Logger;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;


/**
 * This is instantiated with the classname of the gateway connector that will
 * actually do the work. It can deal with either a single QueuedEvent or a list
 * of them, so it can be used with an aggregator or not as desired
 * 
 * The aggregator will until it has either n messages or t seconds before
 * passing along the aggregated Exchange message body containing the list.
 * 
 * This makes it fairly simple to handle sessions and grouped sending etc.
 * 
 * The time t should probably be set to around 1.5 times the desired life of a
 * session. (Note the clickatell method will keep the same session id for
 * 10minutes (timeout is 15).
 * 
 * @version $Id: SMSEndpoint.java 17035 2012-08-13 11:32:49Z ganesan $
 */
public class SMSEndpoint extends BaseEndpoint {
    private final Logger log = Logger.getLogger(SMSEndpoint.class);
   
  
    public void run(@Body Object thing,@Headers Map hdrMap,@OutHeaders Map outHdrs){
    	
    }

}
