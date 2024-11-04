class P {
    public Object m1(){
        return null;
    }
}

class C extends P {
    public String m1(){
        return null;
    }
}

public class Exmple2 {
    public static void main(String[] args){
        P obj = new C();
        obj.m1();
        Object k = obj.m1();
        System.out.println(k);
    }
}

// In the Parent Class (P):

// The method m1() is declared to return an Object.
// In the Child Class (C):

// The method m1() is overridden to return a String.
// Why is this allowed?

// String is a subtype of Object, so it is valid to return String when Object is expected.