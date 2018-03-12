/**
 * When a MallardDuck is instantiated its constructor initializes the MallarDuck's inherited
 * quackBehavior instance variable to a new instance of type Quack ( a QuackBehavior concrete
 * implementation class). Same is true for the duck's flying behavior. MallardDuck's constructor
 * initializes the MallardDuck's inherited instance variable flyBehavior to a new instance of type
 * FlyWithWings. MallardDuck uses the Quack class to handle its quack, so when performQuack() is
 * called, the responsibility of the quack is delegated to the Quack object and we get a real quack.
 * It uses FlyWithWings to handle its flying behavior.
 * 
 * @author Priya Renjith
 **/

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("Im a real Mallard Duck");
  }
}
