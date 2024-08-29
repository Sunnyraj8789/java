import java.util.*;
//implement queue using stacks
//time complexity of add O(1)
//time complexity of remove O(1)
public class implementQueue1 {
    static Queue<Integer>q1=new LinkedList<>();
    static Queue<Integer>q2=new LinkedList<>();
    //add the element in the q1
    static void add(int data){
        //move all the element q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }
//insert new data in the q1
        q1.add(data);

        //move back from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll(); 
        }
    }

    //remove the element

    static int remove(){
        int ele;
        if(q1.isEmpty()){
            System.out.println("stack underflow");
            System.exit(0);
        }

        ele=q1.peek();
        q1.poll();
        return ele;
    }


    public static void main(String[] args) {
        implementQueue1 s=new implementQueue1();
        s.add(2);
        s.add(4);
        s.add(4);
        s.add(8);

        System.out.println("remove element is "+s.remove());

    }
    
}

    
