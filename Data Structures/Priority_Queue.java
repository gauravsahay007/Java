import java.util.*;

public class Priority_Queue{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(43);
        pq.add(12);
        pq.add(65);
        System.out.println(pq);

        int top = pq.peek();
        System.out.println(top);

        System.out.println(pq.poll());

        System.out.println(pq);
        
    }
}