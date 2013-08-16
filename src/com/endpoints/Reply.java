package com.endpoints;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;


public class Reply extends BaseEndpoint{
	
	public void route(@Body Object thing, @Headers Map hdrMap,@OutHeaders Map outHdrs) {
		System.out.println("*********************************************");
	}

}
