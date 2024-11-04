class P {
    public static void m1() {
        System.out.println("Parent class static method");
    }
}

class C extends P {
    public static void m1() {
        System.out.println("Child class static method");
    }
}

public class Example6 {
    public static void main(String[] args) {
        P p = new P();   // Parent class reference and object
        p.m1();  // Calls Parent's static method

        C c = new C();   // Child class reference and object
        c.m1();  // Calls Child's static method

        P pc = new C();  // Parent class reference to child class object
        pc.m1();  // Calls Parent's static method (method hiding)
    }
}


Method Hiding vs. Method Overriding:

// Overriding occurs when a child class provides a new implementation for
//  a non-static method in the parent class with the same 
//  signature.
// Method hiding happens when a static method in the child 
// class has the same signature as a static method in the 
// parent class.
// Hiding, not overriding: The child class hides the parent’s 
// static method, but both methods exist independently.
// Behavior of Static Methods:

// Static methods belong to the class, not to the instance.
// Which method gets called depends on the reference type used,
//  not the object type (unlike method overriding).