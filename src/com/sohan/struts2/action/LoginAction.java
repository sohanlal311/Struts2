package com.sohan.struts2.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sohan.struts2.model.User;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId", "User Id cannot be blank.");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Password cannot be blank.");
		}
	}

	public String execute() {
		if ("sohan".equals(user.getUserId()) && "lal".equals(user.getPassword())) {
			return SUCCESS;
		}
		return LOGIN;
	}

	@Override
	public User getModel() {
		return user;
	}

}
