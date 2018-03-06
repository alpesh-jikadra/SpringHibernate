package com.example.dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.dto.User;

public class Example {

	protected static final ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationcontext.xml" );
	Logger l =  Logger.getLogger(Example.class.getName());
	@Test
	public void test() {
		l.log(Level.INFO, "Info");
		l.log(Level.WARNING, "WARNING");
		
		UserDAO bean = (UserDAO) context.getBean("userDAO");
		List<User> listAll = bean.listAll();
		System.out.println(listAll);
		System.out.println(bean.get());
	}

}
