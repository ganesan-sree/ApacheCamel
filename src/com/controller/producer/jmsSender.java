package com.controller.producer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.message.QueuedEvent;
@Controller
public class jmsSender {

	@RequestMapping(value = "doSendJMS", method = RequestMethod.GET)
	public String doSend(HttpServletRequest request,HttpServletResponse response) throws Exception {		
		System.out.println("hellooooo");	
		QueuedEvent qu= new QueuedEvent();
		try {
			JMSContext.getInstance().sendJMSQueue(qu, "jms:queue:EZMQueue");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
}
