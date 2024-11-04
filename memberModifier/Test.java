public class Test{
    public static void main(String[] args){
        // Create an instance of the class
        ModifiersExample obj = new ModifiersExample();

        // Accessing fields
        System.out.println("Public Field: " + obj.publicField);
        // System.out.println("Private Field: " + obj.privateField); // Error: Cannot access private member
        System.out.println("Protected Field: " + obj.protectedField);
        System.out.println("Default Field: " + obj.defaultField);
        System.out.println("Static Field: " + ModifiersExample.staticField);

        // Accessing methods
        obj.publicMethod();
        // obj.privateMethod(); // Error: Cannot access private member
        obj.protectedMethod();
        obj.defaultMethod();
        ModifiersExample.staticMethod(); // Call static method using class name
        obj.finalMethod();
    }
}