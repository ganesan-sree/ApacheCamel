package com.controller.producer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class jmsSender {

	@RequestMapping(value = "doSend", method = RequestMethod.GET)
	public String doSend(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("hellooooo");
		
				
		return "success";
	}
	
}
