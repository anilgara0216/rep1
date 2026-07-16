package Pack2;


@Configuration
public class SpringRough {
	
	@Bean
	public GamingConsole game() {
		var game = new PackMan();
		return game;
	}
	
	@Bean
	public GameRunner Runner(GamingConsole game) {
		var Runner = new GameRunner(game);
		return Runner;
	}
	
	
	context.getBean(GameRunner.class).run();
	context.getBean(GamingConsole.class).Up();

}
