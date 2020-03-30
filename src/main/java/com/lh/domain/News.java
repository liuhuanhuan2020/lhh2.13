package com.lh.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Table(name="news")
public class News {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private String Ntitle;
 private String Ncontent;
 private String Nauthor;
 @DateTimeFormat(pattern = "yyyy-MM-dd")
 private Date Ntime;
 private Integer userid;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNtitle() {
	return Ntitle;
}
public void setNtitle(String ntitle) {
	Ntitle = ntitle;
}
public String getNcontent() {
	return Ncontent;
}
public void setNcontent(String ncontent) {
	Ncontent = ncontent;
}
public String getNauthor() {
	return Nauthor;
}
public void setNauthor(String nauthor) {
	Nauthor = nauthor;
}
public Date getNtime() {
	return Ntime;
}
public void setNtime(Date ntime) {
	Ntime = ntime;
}

public News(Integer id, String ntitle, String ncontent, String nauthor, Date ntime, Integer userid) {
	super();
	this.id = id;
	Ntitle = ntitle;
	Ncontent = ncontent;
	Nauthor = nauthor;
	Ntime = ntime;
	this.userid = userid;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
public News() {
	super();
}
 
 public String getNtimeTostring() {
	 if(this.Ntime!=null) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		return sim.format(this.Ntime);
	 }
	 return null;
 }
 
}
