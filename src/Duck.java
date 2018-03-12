/**
 * Abstract Duck class that has two instance variables- flyBehavior, quackBehavior. flyBehavior is
 * of the FlyBehavior interface type, quackBehavior is of the quackBehavior interface type. All duck
 * subclasses (within the same package) inherit these. Each instance variable holds a reference to
 * something that implements the respective behavior interface type.
 * 
 * @author Veda Renjith
 *
 */

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  public void performFly() {
    flyBehavior.fly(); // Rather than handling the fly behavior itself, the duck object delegates
                       // that behavior to the object
                       // referenced by flyBehavior.
  }

  public void performQuack() {
    quackBehavior.quack(); // Rather than handling the quack behavior itself, the duck object
                           // delegates that behavior to the object
                           // referenced by quackBehavior.
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
