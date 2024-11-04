import java.util.Stack;
    
public class Stack_Java {
    
    public static void main(String[] args) {
         // Create a generic stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
        
    }
    
}