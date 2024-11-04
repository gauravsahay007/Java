package Volatile;

public class VolatileFlagExample {
    public volatile boolean running = true;

    public void startTask(){
        System.out.println("Task started...");

        Thread worker = new Thread(()->{
            while(running){
                System.out.println("running...");
            }
        });
        worker.start();
    }

    public void stopTask(){
        System.out.println("Stopping task..");
        running = false;
    }

    public static void main(String[] args) throws InterruptedException{
        VolatileFlagExample example = new VolatileFlagExample();
        example.startTask(); // Start the task
        Thread.sleep(1000); // Main thread sleeps for 1 second
        example.stopTask(); //stop the task
    }   
}


/* 

Q: Why do we need volatile here?
A: Without volatile, the change to the running flag in one thread might not 
be visible to other threads immediately due to CPU caching or compiler 
optimizations.

Q: What would happen if volatile were removed?
A: The worker thread might never see the updated value of running and keep 
running indefinitely, causing a liveness issue.

Q: Is volatile enough for synchronization?
A: No, volatile ensures visibility but does not guarantee atomicity for 
compound operations like x++. For such cases, use atomic classes or explicit 
synchronization.

 */