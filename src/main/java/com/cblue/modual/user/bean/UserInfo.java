package com.cblue.modual.user.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInfo implements Serializable {
	

	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_password=" + user_password + "]";
	}
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private int user_id;
	@Column(length=20)
	private String user_name;
	@Column(length=20)
	private String user_password;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
}
