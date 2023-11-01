package codingon.kdt.kdt9.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("LolGameQualifier")
public class LolGame implements GameConsole {
  public void up() { System.out.println("up2"); }
  public void left() {
    System.out.println("left2");
  }
  public void right() {
    System.out.println("right2");
  }
  public void down() { System.out.println("down2");}
}
