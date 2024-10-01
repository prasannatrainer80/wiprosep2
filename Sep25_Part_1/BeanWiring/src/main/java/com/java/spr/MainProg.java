package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/faculty.xml");
		Faculty faculty = (Faculty)ctx.getBean("beanFaculty");
		faculty.teaching();
	}
}
