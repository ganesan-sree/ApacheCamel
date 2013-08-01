package com.easymed.notificationsManager.endpoints;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Headers;
import org.apache.camel.OutHeaders;
import org.apache.camel.component.xmpp.XmppEndpoint;
import org.apache.log4j.Logger;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.Roster.SubscriptionMode;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.PacketFilter;
import org.jivesoftware.smack.filter.PacketTypeFilter;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.Presence;

/**
 * This is called as XmppEndpoint and configurated with one username and
 * consider as Easymedmessenger Client. It jobs to send a message to other
 * client user.
 * 
 * @version $Id: EasyMedXmppEndpoint.java 17035 2012-08-13 11:32:49Z ganesan $
 * @author ganesan
 */

public class EasyMedXmppEndpoint extends BaseEndpoint {

	private static Logger log = Logger.getLogger(EasyMedXmppEndpoint.class);
	private XmppEndpoint endpoint;
	private XMPPConnection connection;
	private Roster roster;

	/**
	 * Initialize connection
	 * 
	 * @param xmpp
	 *            XmppEndpoint with all attributes sets
	 */

	EasyMedXmppEndpoint(XmppEndpoint xmpp) {
		this.endpoint = xmpp;
		try {
			connection = endpoint.createConnection();
			roster = connection.getRoster();
			roster.setSubscriptionMode(SubscriptionMode.manual);
			PacketFilter presenceFilter = new PacketTypeFilter(Presence.class);
			connection.addPacketListener(new PresencePacketListener(),
					presenceFilter);
		} catch (XMPPException e) {
			log.error("Error occuring while Initializing connection", e);
		}
	}

	/**
	 * Sending Outbound message to the particular address .If the address is
	 * unavailable,it forwarding to the next channel.
	 * 
	 * @param thing
	 *            To bind to an inbound message body
	 * @param hdrMap
	 *            To bind to the Map of the inbound message headers
	 * @param outHdrs
	 *            To bind to the Map of the outbound message headers
	 */
	public void run(@Body Object thing, @Headers Map hdrMap,
			@OutHeaders Map outHdrs) {

		roster.reload();

	}

	/**
	 * Return the name of the last processor as IM
	 */
	public String getBeanName() {
		return "IM";
	}

	/**
	 * This class listening to the connection continously for checking presence
	 * of user and this provide a jobs of accepting friend request
	 * 
	 */

	private class PresencePacketListener implements PacketListener {

		public void processPacket(Packet packet) {

			Presence presence = (Presence) packet;
			String from = presence.getFrom();

		}

	}

}
