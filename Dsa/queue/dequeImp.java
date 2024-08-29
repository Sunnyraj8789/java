import java.util.*;

public class dequeImp{
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(4);
        deque.addLast(7);
        deque.addLast(9);

        System.out.println("Deque data is: "+deque);

        // deque.removeFirst();
        

        // System.out.println("Deque data after the deletion is: "+deque);

        System.out.println("top element :- "+deque.peek());


    }
}
    

