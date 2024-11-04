// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void play() {
        System.out.println("Dog plays");
    }
}

// Main Class to Test
public class MultipleInhertance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Implementation from Animal interface
        dog.play();  // Implementation from Pet interface
    }
}
