package com.coderising.ood.ocp.refact.impl;

import com.coderising.ood.ocp.refact.LogSendHandler;

public class MailLogHandler implements LogSendHandler{

	public void send(String logMsg) {
		System.out.println("Mailing log file...");
		System.out.println("Mailed..");
	}

}
