/**
 * Flying behavior implementation for all ducks that do not fly.
 * 
 * @author Priya Renjith
 *
 */

public class FlyNoWay implements FlyBehavior {
  public void fly() {
    System.out.println("I can't fly");
  }
}
