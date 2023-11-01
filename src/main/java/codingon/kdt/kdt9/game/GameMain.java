package codingon.kdt.kdt9.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("codingon.kdt.kdt9.game")
public class GameMain {
  public static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
//    var context = new AnnotationConfigApplicationContext(GameMain.class);

    context.getBean(GameConsole.class).down();
    context.getBean(GameEngine.class).run();


    // 결합 : 무엇인가를 변경하는데 얼마나 많은 작업이 관련되어 있는지에 대한 측정

//    DiabloGame game = new DiabloGame();
//    LolGame game = new LolGame();
//    GameEngine engine = new GameEngine(game);
//v
//    engine.run();
  }
}
