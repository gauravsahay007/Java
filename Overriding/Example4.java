class P {
    public void m1() {
        // Method with a default implementation in the parent class
    }
    
}

abstract class C extends P {
    // Abstract method declaration overriding the parent class method
    public abstract void m1();

}


public class Example4{
    public static void main(String[] args){
        
    }
}


//Overriding an Implemented Method with an Abstract Method:
//Normally, overriding a method provides a more specific behavior.
//However, in an abstract class, you can override a method from the superclass and declare it as abstract, meaning that the subclass "hides" the implementation from the parent class and forces the next level of subclasses to provide their own implementation.