package Producer_Consumer;

public class NotifyAllExample {
    public static void main(String[] args){
        SharedResource resource = new SharedResource();

        Runnable consumerTask = () -> {
            try{
                while(true){
                    resource.consume();
                    Thread.sleep(500);
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        };

        Runnable producerTask = () -> {
            try{
                while (true) {
                    resource.produce(); // Produce a resource
                    Thread.sleep(500);  // Simulate delay
                }
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        };

        // Start 2 consumers and 1 producer thread
        new Thread(consumerTask, "Consumer-1").start();
        new Thread(consumerTask, "Consumer-2").start();
        new Thread(producerTask, "Producer-1").start();
    }
}
