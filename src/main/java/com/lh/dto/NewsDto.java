package com.lh.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class NewsDto extends PageDto{
private String biaoti;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date shijians;
public NewsDto() {
	super();
}
public String getBiaoti() {
	return biaoti;
}
public void setBiaoti(String biaoti) {
	this.biaoti = biaoti;
}
public Date getShijians() {
	return shijians;
}
public void setShijians(Date shijians) {
	this.shijians = shijians;
}


}
