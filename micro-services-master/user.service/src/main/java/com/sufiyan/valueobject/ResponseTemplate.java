package com.sufiyan.valueobject;

import com.sufiyan.modal.User;

public class ResponseTemplate {

	private User user;
	private Department department;

	public ResponseTemplate() {

	}

	public ResponseTemplate(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ResponseTemplate [user=" + user + ", department=" + department + "]";
	}
}
