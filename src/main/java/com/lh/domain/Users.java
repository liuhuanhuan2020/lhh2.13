package com.lh.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
	
private String uname;
private String upwd;
private String sex;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}

public Users(Integer id, String uname, String upwd, String sex) {
	super();
	this.id = id;
	this.uname = uname;
	this.upwd = upwd;
	this.sex = sex;
}
public Users() {
	super();
}

public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Override
public String toString() {
	return "Users [id=" + id + ", uname=" + uname + ", upwd=" + upwd + ", sex=" + sex + "]";
}



}