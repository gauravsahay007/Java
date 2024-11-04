import java.util.*;
    
public class Deque_java {
    
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(1);
        dq.addFirst(2);
        System.out.println(dq);
        dq.addFirst(3);
        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq);
        
    }
    
}