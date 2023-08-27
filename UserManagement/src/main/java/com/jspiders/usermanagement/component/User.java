package com.jspiders.usermanagement.component;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Entity
public class User {
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + "]";
	}
	@Id
	private int uId;
	private String uName;
	private int uPassword;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getuPassword() {
		return uPassword;
	}
	public void setuPassword(int uPassword) {
		this.uPassword = uPassword;
	}

}
