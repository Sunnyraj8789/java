import java.util.LinkedList;
import java.util.*;
//implementation function in java 
public class main {
    public static void main(String[] args) {
          Queue<Integer>q=new LinkedList<>();

          //to add the data inside the queue
          for(int i=0;i<10;i++)
          {
                q.add(i);
          }
          System.out.println("inside the  data in the queue"+q);

          //to display the top element
          System.out.println("top element is before delete "+q.peek());
          q.remove();
          System.out.println("after delete top of the element in the queue  "+q.peek());



          System.out.println("size of the element "+q.size());

    }
    
}
