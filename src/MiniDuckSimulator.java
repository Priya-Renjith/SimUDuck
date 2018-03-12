/**
 * This class calls the MallardDuck's inherited performQuack() method, which then delegates to the
 * object's QuackBehavior (i.e calls quack() on the duck's inherited quackBehavior reference. Then
 * same thing with the inherited performFly() method.
 * 
 * @author Priya Renjith
 *
 */

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck Mallard = new MallardDuck();
    Mallard.performQuack();
    Mallard.performFly();
  }
}
