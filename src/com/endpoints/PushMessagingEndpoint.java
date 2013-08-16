package com.endpoints;

import java.util.Map;


import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.log4j.Logger;

/**
 * 
 * 
 * This class is used as Endpoint for Instant Messaging. Based on the client's
 * smartphone like (i.e Android or Blackberry etc..)
 * 
 * @version $Id$
 * @author ganesan
 */

public class PushMessagingEndpoint extends BaseEndpoint {
	
	
	private final static Logger log = Logger.getLogger(PushMessagingEndpoint.class);
	

	/**
	 * this will redirect to PushDynamic Router from there will route to
	 * coreesponding connector
	 * 
	 */	
	public void route(@Body Object thing, @Headers Map hdrMap,@OutHeaders Map outHdrs) {

	
	}

	/**
	 * Return the name of the last processor as IM.
	 * 
	 * @return IM
	 */
	public String getBeanName() {
		return "push";
	}
}