// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main Class to Test
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Inherited from Animal
        dog.bark();   // Dog's own method

        Cat cat = new Cat();
        cat.sound();  // Inherited from Animal
        cat.meow();   // Cat's own method
    }
}
