package com.udemyy.udemy_larning_sb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.udemyy.udemy_larning_sb.game.GameRunner;
import com.udemyy.udemy_larning_sb.game.GamingConsole;

public class App03GamingSpringBeans
{

	public static void main(String[] args)
	{
		//Launching the spring context(creating spring context)
		
		try (var context =
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class))
		{
			
			context.getBean(GamingConsole.class).Up();
			
			context.getBean(GameRunner.class).run();
		}
		
		
	}
}

