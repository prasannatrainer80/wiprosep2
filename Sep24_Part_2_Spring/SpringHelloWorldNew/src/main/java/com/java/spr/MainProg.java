package com.java.spr;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Hello.xml");
		Date today = new Date();
		HelloWorld helloWorld = null;
		if (today.getHours() <= 12) {
			helloWorld = (HelloWorld)ctx.getBean("bean1");
		}
		if (today.getHours() >= 12 && today.getHours() < 16) {
			helloWorld = (HelloWorld)ctx.getBean("bean2");
		}
		
		if (today.getHours() >= 16) {
			helloWorld = (HelloWorld)ctx.getBean("bean3");
		}
		System.out.println(helloWorld.sayHello("Archana"));
	}
}
