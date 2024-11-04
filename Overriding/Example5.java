class Parent {
    protected void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    // Valid: Overriding with the same access level (protected)
    @Override
    protected void show() {
        System.out.println("Child class method");
    }
}

public class Example5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();  // Calls the child class method
    }
}


// Rules for Access Modifiers in Method Overriding:
// The access level of the overriding method in the subclass must be the same or more accessible than the method in the superclass.

// Reason: The overriding method should not block access to the method that was available in the parent class.
// You cannot reduce the visibility of the method in the subclass. For example:

// A public method in the superclass cannot be overridden as private or protected in the subclass.
// A protected method in the superclass cannot be overridden as private in the subclas


class Parent {
    public void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    // Invalid: Trying to reduce access from public to protected
    @Override
    protected void display() {
        System.out.println("Child class display method");
    }
}


// Why Does Java Enforce This Rule?
// If the child class were allowed to reduce the visibility of an overridden method, it could break the principle of substitutability.
//  This principle, known as the Liskov Substitution Principle 
//  (LSP), ensures that a child class object can be used 
//  wherever a parent class object is expected. Reducing 
//  access would violate this principle.

// private	Least accessible	Cannot be overridden (not inherited).
// public	Most accessible	Can only be overridden as public.
// protectedLess accessible	Can be overridden as protected or public.