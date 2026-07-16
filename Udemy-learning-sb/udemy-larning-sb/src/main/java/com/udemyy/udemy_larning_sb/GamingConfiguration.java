package com.udemyy.udemy_larning_sb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemyy.udemy_larning_sb.game.GameRunner;
import com.udemyy.udemy_larning_sb.game.GamingConsole;
import com.udemyy.udemy_larning_sb.game.PackMan;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PackMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}

}
