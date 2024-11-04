class Calculator {
    // Overloaded method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum (2 ints): " + calc.add(10, 20));
        System.out.println("Sum (3 ints): " + calc.add(10, 20, 30));
        System.out.println("Sum (2 doubles): " + calc.add(5.5, 4.5));
    }
}
