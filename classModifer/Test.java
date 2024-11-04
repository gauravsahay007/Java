public class Test {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display();

        Abstract absClass = new AbstractUser();
        absClass.method1();
        absClass.method2();

        FinalClass obj2 = new FinalClass();
        obj2.display(); // This is a final class.

        
    }
}