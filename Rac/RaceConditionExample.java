package Rac;

public class RaceConditionExample {
    private static int x = 5;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            // Thread 1 reads x, increments, and writes back
            int temp = x;
            temp++; // Increment x
            x = temp; // Write back to x
        });

        Thread thread2 = new Thread(() -> {
            // Thread 2 reads x, increments, and writes back
            int temp = x;
            temp++; // Increment x
            x = temp; // Write back to x
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete
        thread1.join();
        thread2.join();

        // Print the final value of x
        System.out.println("Final value of x: " + x);
    }
}
