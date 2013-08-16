package com.endpoints;

import org.apache.log4j.Logger;
import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import java.util.Map;


/**
 * These are NOT true camel endpoints - that is really not necessary for this
 * application and not really desirable either.
 * 
 * <p>
 * The beanName is used so a handler knows what it has been called in the route
 * definition.
 * </p>
 * 
 * @version $Id: BaseEndpoint.java 17035 2012-08-13 11:32:49Z ganesan $
 */
public class BaseEndpoint implements org.springframework.beans.factory.BeanNameAware {
	private final static Logger log = Logger.getLogger(BaseEndpoint.class);
	private String beanName;

	public BaseEndpoint() {
		// do nothing
	}

	/**
	 * Set the name of the bean in the bean factory 
	 */
	public void setBeanName(String beanName){
		this.beanName=beanName;
	}

	/**
	 * Return the name of the bean from bean fectory
	 * 
	 * @return beanName
	 */
	public String getBeanName(){
		if(beanName==null) {
			return("not-a-bean");
		}
		return(beanName);
	}

	/**
	 * Call setLastProcessor method to find where to send the string next along
	 * with the error status
	 * 
	 * @param thing
	 *            To bind to an inbound message body
	 * @param hdrMap
	 *            To bind to the Map of the inbound message headers
	 * @param outHdrs
	 *            To bind to the Map of the outbound message headers
	 */
	public void run(@Body Object thing,@Headers Map hdrMap,@OutHeaders Map outHdrs){    // typically a queued event
		
	}

	/**
	 * lastProcessor is set as a string by the last endpoint processor to handle
	 * this job its used by EZMDynamicRouter to determine where to send it next,
	 * along with the jobs error status
	 * 
	 * @param qe
	 *            QueuedEvent with all attribute sets
	 */
	public void setLastProcessor(Object qe){
		
	}
}
