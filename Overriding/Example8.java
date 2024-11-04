import java.util.*;

class Example8 {
    public static void main(String[] args) {
        B obj = new B();
        obj.fun();
    }
}

abstract class A {
    Number fun() {
        Double obj = Double.valueOf(9); // Use a valid Number subclass, like Double
        System.out.println("In A: " + obj);
        return obj;
    }
}

class B extends A {
    @Override
    Double fun() {
        Double str = Double.valueOf(8.0); // Use Double directly
        System.out.println("In B: " + str);
        return str;
    }
}
