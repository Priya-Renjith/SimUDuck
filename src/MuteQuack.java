/**
 * Quacking behavior implementation for all ducks that do not quack.
 * 
 * @author Priya Renjith
 *
 */

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<<silence>>");
  }
}
