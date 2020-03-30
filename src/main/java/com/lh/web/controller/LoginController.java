package com.lh.web.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lh.domain.News;
import com.lh.domain.Users;
import com.lh.service.NewsService;
import com.lh.service.UsersService;
import com.lh.util.MyConstants;

@RestController
@RequestMapping("login")
@SessionAttributes(MyConstants.SESSION_USER)
public class LoginController {
	@Autowired
	private NewsService newsService;

	@Autowired
	private UsersService usersService;
 @RequestMapping("log")
 public Users log(Model model ,String uname,String upwd,HttpSession session) {
	  Users user=this.usersService.login(uname, upwd);
	  if(user!=null) {
		  model.addAttribute(MyConstants.SESSION_USER, user);
	  }
	  return user;
	
 }
@RequestMapping("save")
public String save(Users user) {
	boolean i=this.usersService.save(user);
	if(i) {
		return"redirect:/index.jsp";
	}
  return"";
}
@RequestMapping("savexinwen")
public String savexinwen(News news,HttpSession session) {
	Users us=(Users) session.getAttribute(MyConstants.SESSION_USER);
	news.setUserid(us.getId());
	news.setNtime(new Date());
	boolean i=this.newsService.save(news);
	if(i) {
		return"redirect:/mains";
	}
  return"";
}
@RequestMapping("delete")
public String delete(int id) {
	System.out.println(id);
	boolean i=this.newsService.delete(id);
	if(i) {
		return"redirect:/mains";
	}
  return"";
}
}
