package com.easymed.notificationsManager.endpoints;


import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.log4j.Logger;

/**
 * This class is used as Endpoint for HL7 in Camel routing. In it we have
 * sending message to Outside of Application
 * 
 * @version $Id: HL7Endpoint.java 17035 2012-08-13 11:32:49Z ganesan $
 * @author Ganesan
 */

public class HL7Endpoint extends BaseEndpoint {
	
	
private final Logger log = Logger.getLogger(HL7Endpoint.class);
    
private static final char END_OF_BLOCK = '\u001c'; 
private static final char START_OF_BLOCK = '\u000b';
private static final char CARRIAGE_RETURN = 13;

	/**
	 * send HL7 serializable object into camel Endpoint
	 * 
	 * @param thing
	 *            To bind to an inbound message body
	 * @param hdrMap
	 *            To bind to the Map of the inbound message headers
	 * @param outHdrs
	 *            To bind to the Map of the outbound message headers
	 */
    public void run(@Body Object thing,@Headers Map hdrMap,@OutHeaders Map outHdrs){
    	    	
    	    	      
	
								
    }
     
    /**
     * Return the name of the last processor as hl7
     * @return hl7
     */
    public String getBeanName(){
        return("hl7");
    }
    
}
