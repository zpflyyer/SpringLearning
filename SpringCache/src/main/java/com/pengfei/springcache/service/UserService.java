package com.pengfei.springcache.service;


import com.pengfei.springcache.domain.User;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface UserService
{
	User getUsersByNameAndAge(String name, int age);

	User getAnotherUser(String name, int age);

	void evictCache(String name, int age);
}
