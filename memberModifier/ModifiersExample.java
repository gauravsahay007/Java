public class ModifiersExample{

    //Public field (Accessible from anywhere)
    public String publicField = "Public Field";

    // 2. Private field (only accessible within this class)
    private String privateField = "Private Field";

    // 3. Protected field (accessible within the same package and subclasses)
    protected String protectedField = "Protected Field";

    // 4. Default (Package-private) field (accessible only within the package)
    String defaultField = "Default Field";

    // 5. Static field (shared by all instances of the class)
    public static int staticField = 100;

    // 6. Final field (constant value, cannot be changed after initialization)
    public final String finalField = "Constant Value";


    // Constructor to initialize an object
    public ModifiersExample() {
        System.out.println("Constructor called.");
    }


    // 7. Public method (accessible from anywhere)
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // 8. Private method (only accessible within this class)
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // 9. Protected method (accessible within package and subclasses)
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

     // 10. Default (package-private) method (accessible only within package)
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // 11. Static method (belongs to the class, not instance-specific)
    public static void staticMethod() {
        System.out.println("Static Method");
    }

    // 12. Final method (cannot be overridden by subclasses)
    public final void finalMethod() {
        System.out.println("Final Method");
    }

    public static void main(String[] args) {
        
    }

}