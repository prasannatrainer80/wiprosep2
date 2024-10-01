package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Person.xml");
		Person person1 = (Person)ctx.getBean("personSimran");
		person1.showAll();
		
		Person person2 = (Person)ctx.getBean("personSubbarayudu");
		person2.showAll();
		
		Person person3 = (Person)ctx.getBean("personVipul");
		person3.showAll();
	}
}
