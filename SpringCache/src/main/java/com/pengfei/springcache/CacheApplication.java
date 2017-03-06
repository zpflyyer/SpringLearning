package com.pengfei.springcache;

import com.pengfei.springcache.domain.User;
import com.pengfei.springcache.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CacheApplication
{
	public static void main(String[] args)
	{
		ApplicationContext ctx =
			new ClassPathXmlApplicationContext("ehcache_beans.xml");
		UserService us = ctx.getBean("userService" , UserService.class);
		User u1 = us.getUsersByNameAndAge("monkey king", 500);
		System.out.println(u1);
		User u2 = us.getAnotherUser("monkey king", 500);
		System.out.println(u2);
		System.out.println(u1 == u2);

		us.evictCache("monkey king",500);

		User u3 = us.getUsersByNameAndAge("monkey king",500);
		System.out.println(u3);
	}
}
