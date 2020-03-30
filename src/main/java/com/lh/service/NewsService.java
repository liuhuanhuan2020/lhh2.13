package com.lh.service;


import com.github.pagehelper.PageInfo;
import com.lh.domain.News;
import com.lh.dto.NewsDto;

public interface NewsService {
public PageInfo<News> select(NewsDto dto);
public News Byid(int id);
public Boolean save(News news);
public Boolean delete(int id);
}
