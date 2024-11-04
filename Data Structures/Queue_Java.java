import java.util.*;
    
public class Queue_Java {
    
    public static void  main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        int front = q.peek();
        System.out.println(front);
        
        System.out.println(q);
        q.poll();
        System.out.println(q);
        
    }
    
}