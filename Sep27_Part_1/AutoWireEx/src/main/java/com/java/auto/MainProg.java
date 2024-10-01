package com.java.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/auto/person.xml");
		Person person = (Person)ctx.getBean("beanKalpana");
		person.showAllInfo();
	}
}
