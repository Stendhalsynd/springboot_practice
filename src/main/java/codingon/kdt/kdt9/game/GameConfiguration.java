package codingon.kdt.kdt9.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
  @Bean
  public GameConsole diabloGame() {
    return new DiabloGame();
  }

  @Bean
  public GameEngine gameEngine(GameConsole diabloGame) {
    return new GameEngine(diabloGame);
  }
}
