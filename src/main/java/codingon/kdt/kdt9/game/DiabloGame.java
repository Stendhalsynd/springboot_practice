package codingon.kdt.kdt9.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("DiabloGameQualifier")
public class DiabloGame implements GameConsole {
  public void up() { System.out.println("up"); }
  public void left() {
    System.out.println("left");
  }
  public void right() {
    System.out.println("right");
  }
  public void down() {
    System.out.println("down");
  }
}
