// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}

// At runtime, the type of the actual object determines which sound() method is invoked.
public class RuntimePoly {
    public static void main(String[] args) {
        // Parent class reference pointing to child class objects
        Animal animal;

        animal = new Dog();  // Dog object
        animal.sound();  // Calls Dog's sound() method

        animal = new Cat();  // Cat object
        animal.sound();  // Calls Cat's sound() method
    }
}
