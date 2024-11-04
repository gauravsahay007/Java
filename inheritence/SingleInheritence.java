// Parent Class
class Animal {
    void sound() {
        System.out.println("Animals make different sounds");
    }
}

// Child Class (Inheriting from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main Class to Test
public class SingleInheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Inherited from Animal class
        dog.bark();   // Dog's own method
    }
}
