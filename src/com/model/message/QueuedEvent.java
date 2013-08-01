package com.model.message;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


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


	/** this is a new message loaded by the system  **/
	public static final int STATE_NEW  = 0;

	/** the message is being processed in the waiting queued to be sent**/
	public static final int STATE_PROCESSING  = 1;

	/** the message is currently being sent to the gateway**/
	public static final int STATE_SUBMITTING_TO_GATEWAY  = 2;

	/** the message has been delivered to the gateway **/
	public static final int STATE_DELIVERED_TO_GATEWAY = 3;

	/** the message has been delivered to the gateway  but the gateway responded with an error **/
	public static final int STATE_GATEWAY_ERROR = 4;

	/** the message has been downlaoded by mobile apps **/
	public static final int STATE_CONTENT_RETRIEVED = 5;	
	


	
		
}
