package com.coderising.ood.srp.refact.entity;


/**
 * 消息类，其实还可以再扩展，如果预计通知的方式不止email一种，可以再次抽象出一个MessageObj，然后面向Message抽象类编程
 *
 */
public class EmailObj {
	private String subject;
	private String content;
	private User toWhere;
	private String fromWhere;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFromWhere() {
		return fromWhere;
	}
	public void setFromWhere(String fromWhere) {
		this.fromWhere = fromWhere;
	}
	public User getToWhere() {
		return toWhere;
	}
	public void setToWhere(User toWhere) {
		this.toWhere = toWhere;
	}
}
