package com.coderising.ood.ocp.refact;

public class Logger {
	
	public final int RAW_LOG = 1;
	public final int RAW_LOG_WITH_DATE = 2;
	public final int EMAIL_LOG = 1;
	public final int SMS_LOG = 2;
	public final int PRINT_LOG = 3;
	
	int type = 0;
	int method = 0;
	LogSendHandler logSendHandler ;
	LogTypeHandler logTypeHandler;
			
	public Logger(int logType, int logMethod){
		this.type = logType;
		this.method = logMethod;
	}
	public void log(String msg){
		logSendHandler.send(logTypeHandler.decorateMsg(msg));
	}
}

