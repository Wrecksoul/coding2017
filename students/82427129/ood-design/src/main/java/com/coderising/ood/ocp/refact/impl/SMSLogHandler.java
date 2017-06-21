package com.coderising.ood.ocp.refact.impl;

import com.coderising.ood.ocp.refact.LogSendHandler;

public class SMSLogHandler implements LogSendHandler{

	public void send(String logMsg) {
		System.out.println("SMS...");
		System.out.println("SMS finished...");
	}

}
