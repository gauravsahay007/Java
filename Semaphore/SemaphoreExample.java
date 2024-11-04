package Semaphore;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

// Empty  Full  Mutex
//  5       0     1

//Buffer => 5 , _ _ _ _ _
//Mutex => 1 
//Empty => 2
//Full => 1 => Atleast 1 item in the buffer to consume 
class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    // Semaphores for empty slots, full slots, and mutual exclusion
    private final Semaphore empty;
    private final Semaphore full;
    private final Semaphore mutex;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        this.empty = new Semaphore(capacity); // Start with all slots empty
        this.full = new Semaphore(0);         // Start with no items
        this.mutex = new Semaphore(1);        // Mutex for exclusive access
    }

    // Produce an item
    public void produce(int item) throws InterruptedException {
        empty.acquire();  // Wait for an empty slot
        mutex.acquire();  // Wait for exclusive access to the buffer

        buffer.add(item); // Add item to the buffer
        System.out.println("Produced: " + item);

        mutex.release();  // Release the lock
        full.release();   // Signal that there's a new item
    }

    // Consume an item
    public int consume() throws InterruptedException {
        full.acquire();   // Wait for a full slot
        mutex.acquire();  // Wait for exclusive access to the buffer

        int item = buffer.poll(); // Remove item from buffer
        System.out.println("Consumed: " + item);

        mutex.release();  // Release the lock
        empty.release();  // Signal that there's an empty slot

        return item;
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5); // Buffer with capacity of 5

        // Producer task
        Runnable producerTask = () -> {
            try {
                int item = 0;
                while (true) {
                    buffer.produce(item++);
                    Thread.sleep(500); // Simulate production time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Consumer task
        Runnable consumerTask = () -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(500); // Simulate consumption time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Start 1 producer and 2 consumers
        new Thread(producerTask, "Producer-1").start();
        new Thread(consumerTask, "Consumer-1").start();
        new Thread(consumerTask, "Consumer-2").start();
    }
}
