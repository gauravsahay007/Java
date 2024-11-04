// Base Class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Intermediate Class (Child of Animal)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Final Class (Child of Mammal)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main Class to Test
public class MultilevelInheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Dog's own method
    }
}
