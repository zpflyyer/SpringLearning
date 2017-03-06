package com.pengfei.springcache.service.impl;

import com.pengfei.springcache.domain.User;
import com.pengfei.springcache.service.UserService;
import lombok.ToString;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2014, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Service("userService")
@Cacheable(value = "users")
public class UserServiceImpl implements UserService
{
	public User getUsersByNameAndAge(String name, int age)
	{
		System.out.println("--findUsersByNameAndAge()--");
		return new User(name, age);
	}
	public User getAnotherUser(String name, int age)
	{
		System.out.println("--findAnotherUser()--");
		return new User(name, age);
	}

	@CacheEvict(value = "users")
	public void evictCache(String name, int age) {
		System.out.println(this.getUsersByNameAndAge("monkey king", 500));
		System.out.println("Evicting 'users' cache");
	}
}