package com.controller.producer;

import java.io.Serializable;
import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
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
	private ProducerTemplate producerTemplate = null;
	private ConsumerTemplate consumerTemplate = null;
	
	public JMSContext(CamelContext context) {
		
		if (_JMSContext == null) {
			_JMSContext = this;
			producerTemplate = context.createProducerTemplate();
			consumerTemplate= context.createConsumerTemplate();
			try {
				consumerTemplate.start();				
			} catch (Exception e) {			
				e.printStackTrace();
			}
		} 
	}

	public void sendJMSQueue(Serializable object ,String queueName) {		
		if (producerTemplate == null) {
			return;
		}		
		producerTemplate.sendBody(queueName, object);		
	}

	

	public static JMSContext getInstance() {
		return (_JMSContext);
	}

}
