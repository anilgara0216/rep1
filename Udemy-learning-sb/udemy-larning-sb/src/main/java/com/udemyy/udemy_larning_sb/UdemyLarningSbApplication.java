package com.udemyy.udemy_larning_sb;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemyy.udemy_larning_sb.game.GameRunner;
import com.udemyy.udemy_larning_sb.game.MarioGame;
import com.udemyy.udemy_larning_sb.game.PackMan;
import com.udemyy.udemy_larning_sb.game.SuperContraGame;

@SpringBootApplication
public class UdemyLarningSbApplication {

	public static void main(String[] args) {
//		//MarioGame game = new MarioGame();
//		
//		SuperContraGame game = new SuperContraGame();
//		
//		//PackMan game = new PackMan();
//		GameRunner runner = new GameRunner(game);
//		runner.run();	
		SpringApplication.run(UdemyLarningSbApplication.class, args);

	}
}

