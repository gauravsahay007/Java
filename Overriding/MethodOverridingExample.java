class Animal{
    // Method to be overridden in subclass
    public void sound(){
        System.out.println("Animals make sound.");
    }

    // Final method (cannot be overridden)
    public final void sleep() {
        System.out.println("Animals sleep.");
    }

    // Private method (cannot be overridden)
    private void breathe() {
        System.out.println("Animal is breathing.");
    }

    // Example of method returning an Animal object (for covariant return type demonstration)
    public Animal getInstance() {
        return new Animal();
    }
}

class Dog extends Animal {
    public void sound(){
        System.out.println("Dog barks.");
    }

    public Dog getInstance() {
        return new Dog();
    }

    // Method to call the parent class's overridden method using super keyword
    public void callParentSound() {
        super.sound();  // Calls Animal's sound() method
    }

    // Overloading (not overriding) the sound method with a different parameter
    public void sound(String message) {
        System.out.println("Dog says: " + message);
    }
}

public class MethodOverridingExample{
    public static void main(String[] args){
        // Example of runtime polymorphism
        Animal animal  = new Dog(); // Parent reference pointing to child object
        animal.sound();  // Calls Dog's overridden sound() method (runtime polymorphism)

        Dog dog = new Dog();
        dog.sound(); // Calls Dog's sound() method
        dog.sound("I am happy.");// Overloaded method (not overriding)
        dog.callParentSound();// Calls the parent class method using super


        Animal newAnimal = dog.getInstance();  // Calls Dog's getInstance()
        System.out.println("New Animal is a: " + newAnimal.getClass().getSimpleName());

        // Calling final method (cannot be overridden)
        dog.sleep();
    }
}