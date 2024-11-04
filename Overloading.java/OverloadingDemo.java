public class OverloadingDemo {

    // Overloaded methods with different parameter types
    public void display(int num) {
        System.out.println("Integer version: " + num);
    }

    public void display(long num) {
        System.out.println("Long version: " + num);
    }

    public void display(float num) {
        System.out.println("Float version: " + num);
    }

    public void display(double num) {
        System.out.println("Double version: " + num);
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();

        // Calling overloaded methods with different data types
        byte b = 10;
        short s = 20;
        int i = 30;
        char c = 'A';  // ASCII value of 'A' is 65

        //byte -> short -> int -> long -> float -> double
        //char -> int

        obj.display(b);  // byte -> int
        obj.display(s);  // short -> int
        obj.display(i);  // Exact match: int
        obj.display(c);  // char -> int
    }
}
