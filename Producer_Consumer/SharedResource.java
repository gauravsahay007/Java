package Producer_Consumer;

public class SharedResource {
    private boolean isAvailable = false;

    //consume method for consumers
    public synchronized void consume() throws InterruptedException {
        while(!isAvailable){// Wait if no resource available
            wait();// Consumer waits until notified by producer
        }
        System.out.println(Thread.currentThread().getName() + "consumed the resource");
        isAvailable = false;  // Mark resource as consumed
        notifyAll(); // Notify all waiting threads
    }


    //produce method for producers
    public synchronized void produce() throws InterruptedException {
        while(isAvailable){ // Wait if the resource is already available
            wait();
        }
        System.out.println(Thread.currentThread().getName() + " produced the resource.");
        isAvailable = true;  // Mark resource as produced
        notifyAll();  // Notify all waiting threads
    }

    public static void main(String[] args){

    }
}
