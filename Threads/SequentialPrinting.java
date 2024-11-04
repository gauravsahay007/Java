package Threads;
import java.util.*;

public class SequentialPrinting {
    public static void main(String[] args){
        Printer printer = new Printer(5);
        for(int i=1;i<=5;i++){
            final int threadId = i;
            new Thread(()-> printer.print(threadId)).start();
        }
    }
}

class Printer{
    private int turn = 1;
    private final int maxThreads;

    public Printer(int maxThreads){
        this.maxThreads = maxThreads;
    }

    public synchronized void print(int threadId){
        for(int i=0 ; i<3; i++){
            while(threadId != turn){
                try{
                    wait();
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("Thread " + threadId + " prrints " + (i+1));
            turn = (turn % maxThreads) + 1;
            notifyAll();
        }
    }
}

/* 
 * Thread Creation:

The for loop creates 5 threads, one after 
another, with IDs from 1 to 5.
Each thread starts running asynchronously
 (not waiting for the others to finish).

 Thread Execution:

Even though each thread starts with a call to the print method, 
the JVM and OS thread scheduler decide when each thread 
gets to execute.
Without synchronization, the threads would run in an unpredictable order,
 possibly interleaving their outputs.
However, the print method is synchronized, meaning only
 one thread can execute it at a time.

 How Does synchronized Affect Execution?

When a thread enters the synchronized block, it acquires a lock on the Printer object.
Other threads must wait until the lock is released by the current thread.
After the current thread completes one iteration of printing and notifies 
all waiting threads, the next thread in sequence can proceed.
 */

 /*
  * Is the Execution Synchronous?
No, the execution of the threads is not synchronous in the sense that they run one after another in a strict sequence.
Instead, the threads compete for the lock on the Printer object, but only one thread can hold the lock at a time due to the synchronized block.
wait() and notifyAll() are used to ensure that threads print in the correct order (one after the other, based on turn).

  */

  /*
   * Q: What is a race condition?
A: A race condition occurs when multiple threads access and modify shared data simultaneously, leading to incorrect or unpredictable results.

Q: How can you prevent race conditions?
A: By using atomic classes (like AtomicInteger) or synchronized blocks to ensure that only one thread modifies the data at a time.
   */