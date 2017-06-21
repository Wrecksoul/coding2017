package com.coderising.ood.ocp.refact.impl;

import com.coderising.ood.ocp.refact.LogTypeHandler;

public class DateLogType implements LogTypeHandler{

	public String getCurrentDateAsString() {
		
		return null;
	}

	@Override
	public String decorateMsg(String msg) {
		return msg+":"+getCurrentDateAsString();
	}

}
