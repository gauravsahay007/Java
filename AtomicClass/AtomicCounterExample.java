package AtomicClass;
import java.util.concurrent.atomic.*;;

public class AtomicCounterExample {
    private AtomicInteger counter = new AtomicInteger(0);
    
    public void increment(){
        counter.getAndIncrement(); //Atomic increment
    }

    public int getCounter(){
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounterExample example = new AtomicCounterExample();

        Thread[] threads = new Thread[10];
        /* 
         * Are Threads Executed Synchronously or Asynchronously?
In your code, each thread runs asynchronously and independently. That means 
the threads do not execute one after the other in a strict order — they run 
concurrently, based on how the operating system schedules them.

Even though you may create the threads one by one in a loop, the
execution order and timing of each thread are determined by the thread
scheduler, which is managed by the JVM and OS. Thus, threads are not 
guaranteed to execute in sequence just because they were created in a sequence.
         */
        for(int i=0;i<10;i++){
            threads[i] = new Thread(() -> {
                for(int j=0;j<1000;j++){
                    example.increment();
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for(Thread thread : threads){
            thread.join();
        }

        // Get the final counter value
        System.out.println("Final Counter Value: " + example.getCounter());
    }
}


/* 
 * Why Use AtomicInteger?

Atomic operations: getAndIncrement() ensures the read-modify-write sequence is done atomically.
Without AtomicInteger, multiple threads might read the same value, increment it, and overwrite each 
other's results, causing race conditions.
How AtomicInteger Works:

It uses Compare-and-Swap (CAS) internally to ensure atomicity without using
 explicit locks.
CAS checks if the value is what we expect. If so, it updates it; otherwise,
 it retries.

How AtomicInteger Works:

It uses Compare-and-Swap (CAS) internally to ensure atomicity without using 
explicit locks.
CAS checks if the value is what we expect. If so, it updates it; otherwise, 
it retries.
 */

 /* 
  * Q: Are the threads running synchronously or asynchronously?
A: The threads run asynchronously since they are managed by the JVM's 
thread scheduler. However, the use of synchronized ensures that only one
 thread can print at a time, giving the illusion of sequential execution.
  */

  