// Base class (Single Inheritance)
class Animal {
    void sound() {
        System.out.println("Animal makes sound.");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Wild {
    void hunt();
}

// Class Dog inheriting from Animal and implementing two interfaces (Hybrid Inheritance)
class Dog extends Animal implements Pet, Wild {
    @Override
    public void play() {
        System.out.println("Dog plays fetch.");
    }

    @Override
    public void hunt() {
        System.out.println("Dog hunts small animals.");
    }
}

// Main class to demonstrate hybrid inheritance
public class HybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Inherited from Animal class
        dog.play();   // Implemented from Pet interface
        dog.hunt();   // Implemented from Wild interface
    }
}
