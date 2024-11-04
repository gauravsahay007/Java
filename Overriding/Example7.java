class P {
    String s = "Parent";
}

class C extends P {
    String s = "Child";
}

class Example7 {
    public static void main(String[] args) {
        P p = new P();  // Parent class object
        System.out.println(p.s);  // Accesses Parent's field

        C c = new C();  // Child class object
        System.out.println(c.s);  // Accesses Child's field

        P p2 = new C();  // Parent reference pointing to Child object
System.out.println(p2.s);  // Output: "Parent"

    }
}

// Fields (variables) are not polymorphic in Java.
// Even if a child class declares a field with 
// the same name as a field in the parent class, 
// the two fields are independent of each other.
