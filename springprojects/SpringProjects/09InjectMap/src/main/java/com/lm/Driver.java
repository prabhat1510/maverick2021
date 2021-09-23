package com.lm;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Driver {

	public static void main(String[] args) {
		String confFile = "beans.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		FilmDirectors filmDir = (FilmDirectors) context.getBean("filmDirectors");
		filmDir.printDirectorsMap();
		filmDir.printDirectorsList();

	}

}
