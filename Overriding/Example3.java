class Parent{
    public Number getValue(){
        return 42;
    }
}

class Child extends Parent{
    public Integer getValue(){
        return 42;
    }
}

class AnotherChild extends Parent{
    public Float getValue(){
        return 42.0f;
    }
}

public class Example3 {
    public static void main(String[] args){
        Parent p1 = new Child();
        System.out.println("Child class returns: " + p1.getValue());

        Parent p2 = new AnotherChild();
        System.out.println("AnotherChild class returns: " + p2.getValue());
    }
}

// In Java, Number is a superclass for classes like Integer, 
// Float, Double, etc. When using covariant return types, 
// a subclass can override a method to return a more specific 
// type (e.g., Integer or Float), even if the parent 
// class method returns the more general Number type.


//Primitive types (like int, float) do not support covariant return types directly, because covariant return types only apply to objects.
//If you need covariant behavior for primitives, you can return their wrapper classes (like Integer, Float).