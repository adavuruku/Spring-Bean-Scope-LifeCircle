package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCircle {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCircle-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		//the init will first print - doMyStartupStuff
		// then the bellow code
		System.out.println(theCoach.getDailyWorkout());
	
		//the destroy method doMyCleanupStuff
		
		
		// close the context
		context.close();
	}

}








