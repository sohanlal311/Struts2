package com.sohan.struts2.action;

import com.opensymphony.xwork2.Action;

public class TutorialAction implements Action {

	private String language;

	private String message;

	public String execute() {
		setMessage("java".equals(language) ? "Java Brains" : "Language not supported!");
		return SUCCESS;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
