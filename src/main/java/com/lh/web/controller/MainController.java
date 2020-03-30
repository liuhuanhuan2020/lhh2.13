package com.lh.web.controller;

import java.util.Date;
import java.util.List;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.PageInfo;
import com.lh.domain.News;
import com.lh.dto.NewsDto;
import com.lh.service.NewsService;
import com.lh.service.UsersService;

@Controller
@SessionAttributes({"pageinfo","news"})
public class MainController {
@Autowired
private NewsService newsService;
@Autowired
private UsersService usersService;
	@RequestMapping("mains")
	public String main(Model model,NewsDto dto) {	
		if(dto.getPage()==0) {
			dto.setPage(1);
		}
		PageInfo pageinfo=this.newsService.select(dto);
		model.addAttribute("pageinfo", pageinfo);
		return"main";
	}
	@RequestMapping("saveUI")
	public String save() {
		 return "regisuser";	  	  		
	}
	@RequestMapping("Byid")
	public String save(int id,Model model) {
		News news=this.newsService.Byid(id);
		model.addAttribute("news", news);
		 return "shownews";	  	  		
	}
	@RequestMapping("xinwenUI")
	public String xinwenUI() {
		 return "createNews";	  	  		
	}
	@ResponseBody
	@RequestMapping("findname")
	public List findname(String name) {
		List list=this.usersService.findname(name);
		return list;
	}
	@ResponseBody
	@RequestMapping("findsex")
	public List findsex(String sex) {
		List list=this.usersService.findsex(sex);
		return list;
	}
}
