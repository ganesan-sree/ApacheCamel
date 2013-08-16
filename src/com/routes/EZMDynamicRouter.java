package com.routes;

import java.util.Map;

import javax.net.ssl.TrustManager;

import org.apache.camel.Body;
import org.apache.camel.DynamicRouter;
import org.apache.camel.Exchange;
import org.apache.camel.Header;
import org.apache.camel.Properties;
import org.apache.log4j.Logger;
import com.model.message.QueuedEvent;

public class EZMDynamicRouter {
    private static Logger log = Logger.getLogger(EZMDynamicRouter.class);
    public EZMDynamicRouter() {
        registerMyTrustManager();
    }

	    @DynamicRouter
	public String route(@Body Object thing,	@Header(Exchange.SLIP_ENDPOINT) String ePrevious,@Properties Map<Object, Object> properties) { 													
		QueuedEvent qe = (QueuedEvent) thing;
		System.out.println("Dyanic router !!!!!!!!!!!!!!!!!!!!"+ePrevious);
		
		if(ePrevious !=null && ePrevious.contains("clickatell")){
			return "seda:email";
		}
		if(ePrevious !=null && ePrevious.contains("email")){
			return "seda:push";
		}
		if(ePrevious !=null && ePrevious.contains("push")){
			return "seda:hl7";
		}
		return "seda:clickatell";
	}

 

    /**
     * This methods changes the Default SSL socket to enable the client to
     * connect to any server*
     */
	private void registerMyTrustManager() {
		TrustManager[] trustAll = new javax.net.ssl.TrustManager[] { new javax.net.ssl.X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}
			public void checkClientTrusted(
					java.security.cert.X509Certificate[] certs, String authType) {
			}
			public void checkServerTrusted(
					java.security.cert.X509Certificate[] certs, String authType) {
			}
		} };

		try {
			javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("SSL");
			sc.init(null, trustAll, new java.security.SecureRandom());
			javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
			log.error(e);
		}
    }

}