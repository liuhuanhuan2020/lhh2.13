package com.lh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lh.dao.UserMapper;
import com.lh.domain.Users;
import com.lh.service.UsersService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class UsersServiceImpl implements UsersService{
@Autowired
private UserMapper userMapper;
	@Override
	public Users login(String name,String pwd) {
		// TODO Auto-generated method stub
		Example example=new Example(Users.class);
		Criteria crit=example.createCriteria();
		crit.andEqualTo("uname", name);
		crit.andEqualTo("upwd", pwd);
		Users us=(Users) this.userMapper.selectOneByExample(example);
		return us;
		
	}
	@Override
	public boolean save(Users us) {
		// TODO Auto-generated method stub
		return this.userMapper.insert(us)>0?true:false;
	}
	@Override
	public List<Users> findname(String name) {
		// TODO Auto-generated method stub
		Example example=new Example(Users.class);
		Criteria crit=example.createCriteria();
		if(name!=null &&!"".equals(name)) {
			crit.andLike("name", "%"+name+"%");
		}
		
		List list=this.userMapper.selectByExample(example);
		return list;
	}
	@Override
	public List<Users> findsex(String sex) {
		Example example=new Example(Users.class);
		Criteria crit=example.createCriteria();
		crit.andEqualTo("sex", sex);
		List list=this.userMapper.selectByExample(example);
		return list;
	}

}
