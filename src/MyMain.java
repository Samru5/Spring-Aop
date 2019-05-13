package com.capgemini.spring.test;
import org.springframework.context.*;
import com.capgemini.spring.model.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.*;

public class MyMain
{

	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Demo d =context.getBean(Demo.class);
		d.check(15);
	}
}