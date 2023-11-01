package codingon.kdt.kdt9.game;

//import org.springframework.beans.factory.annotation.Qualifier;

public class GameEngine{
  private GameConsole game;

  public GameEngine(GameConsole game) { this.game = game; }
//  public GameEngine(@Qualifier("LolGameQualifier") GameConsole game) {
//    this.game = game;
//  }
  public void run() {
    game.up();
    game.down();
    game.right();
    game.left();
  }
}
