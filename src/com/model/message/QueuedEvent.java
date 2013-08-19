package com.model.message;

import java.io.Serializable;

/**
 * This class represents an event that is used in a waiting queue for sending.
 * Its payload is an implementation of a specific message to send.
 * 
 * <ul>
 * <li>lastProcessor is set as a string by the last endpoint processor to handle
 * this job its used by EZMDynamicRouter to determine where to send it next,
 * along with the jobs error status</li>
 * 
 * <li>errors is a list of errors that occur while handling this job. After each
 * attempt to handle the job the errors are 'stored'</li>
 * </ul>
 * 
 * @version $Id: QueuedEvent.java 17804 2012-11-06 10:57:30Z ganesan $
 * @author twacinski + adam
 */
public class QueuedEvent implements Serializable {


	private String lastChannel = null;

	
	
	@Override
	public String toString() {
	
		return ""+getLastChannel();
	}

	public String getLastChannel() {
		return lastChannel;
	}

	public void setLastChannel(String lastChannel) {
		this.lastChannel = lastChannel;
	}
	
	
	
	
}
