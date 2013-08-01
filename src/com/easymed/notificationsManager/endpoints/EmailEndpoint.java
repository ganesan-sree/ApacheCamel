package com.easymed.notificationsManager.endpoints;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.log4j.Logger;

/**
 * This class is used as Endpoint for Email in Camel routing. In it we have
 * sending email to the given recipient address.If the recipient address is null
 * it forward that email to next Endpoint.
 * 
 * @version $Id: EmailEndpoint.java 17035 2012-08-13 11:32:49Z ganesan $
 */
public class EmailEndpoint extends BaseEndpoint {
	
	private final static Logger log = Logger.getLogger(EmailEndpoint.class);

	/**
	 * default no-args constructor
	 */
	public EmailEndpoint() {
	}

	/**
	 * EmailEndpoint with recipient email address is empty forwarding it to next
	 * EndPoint and updating the database after sending Email
	 * 
	 * @param thing
	 *            To bind to an inbound message body
	 * @param hdrMap
	 *            To bind to the Map of the inbound message headers
	 * @param outHdrs
	 *            To bind to the Map of the outbound message headers
	 */

	public void run(@Body Object thing, @Headers Map hdrMap,@OutHeaders Map outHdrs) {

	
		
	}

	/**
	 * Return the name of the last processor as email.
	 * 
	 * @return email
	 */
	public String getBeanName() {
		return "email";
	}




}