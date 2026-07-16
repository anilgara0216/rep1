package com.udemyy.udemy_larning_sb.game;

public class GameRunner {
	//private MarioGame game;
	//private SuperContraGame game;
	//private PackMan game;
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		game.Left();
		game.Down();
		game.Right();
		game.Up();
		
	}

}
