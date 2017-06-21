package com.coderising.ood.ocp.refact.impl;

import com.coderising.ood.ocp.refact.LogTypeHandler;

public class SimpleLogType implements LogTypeHandler {

	@Override
	public String decorateMsg(String msg) {
		return msg;
	}

}
