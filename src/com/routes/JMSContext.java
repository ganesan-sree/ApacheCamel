package com.routes;

import java.io.Serializable;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.Logger;


/**
 * This Class is used to send serializable object to JMS Queue
 * 
 * @version $Id: JMSContext.java 17022 2012-08-13 09:38:45Z ganesan $
 * 
 * @author Ganesan
 */

public class JMSContext {
	
	private static Logger log = Logger.getLogger(JMSContext.class);
	private static JMSContext _JMSContext;	
	private ProducerTemplate template = null;
	private String _queueName;

	/**
	 * Creates a new <code>ProducerTemplate</code> which is started and
	 * therefore ready to use right away.
	 * 
	 * @param context
	 *            used to configure routes and the policies to use during
	 *            message exchanges between endpoints.
	 * @param _queueName
	 *            the JMS queue.
	 */
	public JMSContext(CamelContext context, String _queueName) {
		this._queueName=_queueName;
		if (_JMSContext == null) {
			_JMSContext = this;
			template = context.createProducerTemplate();			
		} 
	}

	/**
	 * send any serializable object to the JMS queue.
	 * 
	 * @param object
	 *            serializable object.
	 */
	public void enQueue(Serializable object) {		
		if (template == null) {
			return;
		}		
		template.sendBody(_queueName, object);		
	}

	/**
	 * Creating JMSContext singleton class reference
	 * 
	 * @return JMSContext the JMSContext singleton class reference
	 */

	public static JMSContext getInstance() {
		return (_JMSContext);
	}

}
