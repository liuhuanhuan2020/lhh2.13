package com.lh.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lh.dao.NewsMapper;
import com.lh.domain.News;
import com.lh.dto.NewsDto;
import com.lh.service.NewsService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class NewsServiceImpl implements NewsService{
@Autowired
private NewsMapper newsMapper;
	@Override
	public PageInfo<News> select(NewsDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getPageSize());
		Example example=new Example(News.class);
		Criteria crit=example.createCriteria();
		if(dto.getBiaoti()!=null&&!"".equals(dto.getBiaoti())) {
			crit.andLike("Ntitle", "%"+dto.getBiaoti()+"%");
		}
		if(dto.getShijians()!=null) {
			crit.andBetween("Ntime", dto.getShijians(), new Date());
		}
		List list=this.newsMapper.selectByExample(example);
		PageInfo<News> pageinfo=new PageInfo<News>(list);
		return pageinfo;

	}
	@Override
	public News Byid(int id) {
		News news=this.newsMapper.selectByPrimaryKey(id);	
		return news;
	}
	@Override
	public Boolean save(News news) {
		// TODO Auto-generated method stub
		return this.newsMapper.insert(news)>0?true:false;
	}
	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return this.newsMapper.deleteByPrimaryKey(id)>0?true:false;
	}


}
