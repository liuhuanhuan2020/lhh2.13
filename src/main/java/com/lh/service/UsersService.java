package com.lh.service;

import java.util.List;

import com.lh.domain.Users;

public interface UsersService {
public Users login(String name,String pwd);
public boolean save(Users us);
public List<Users> findname(String name);
public List<Users> findsex(String sex);
}
