// Abstract Class (Animals)
abstract class AbstractAnimal {
    // Abstract method (does not have a body)
    public abstract void eat();

    // Non-abstract method
    public void dance() {
        System.out.println("Animals can dance");
    }
}

// Concrete Child Class implementing the abstract class
class ConcreteDog extends AbstractAnimal {
    // Implementation of the abstract method
    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }

    public void move() {
        System.out.println("Dog can move");
    }
}

// Main execution demo class
public class AbstractDemo {
    public static void main(String[] args) {
        // Cannot instantiate AbstractAnimal directly: AbstractAnimal a = new AbstractAnimal(); // Error!
        
        ConcreteDog d = new ConcreteDog();
        d.eat();    // Calls overridden abstract method
        d.dance();  // Calls inherited concrete method
        d.move();   // Calls child method
    }
}