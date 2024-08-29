
//implement queue using stacks
//time complexity of enqueue:- O(1);
//time complexity of dequeue :- O(n);
//space complexity : O(n)

import java.util.Stack;

public class implementQueue {
    static Stack<Integer>stack1=new Stack<>();
    static Stack<Integer>stack2=new Stack<>();

    //insertion of the data in the queue
//time complexity is :O(1)
    static void enqueue(int data){
        stack1.push(data);

    }

    //deletion of the  data from the queue -FIFO
    static int dequeue(){
        int ele;
        if(stack1.empty()&&stack2.empty()){
            System.out.println("queue is empty");
            System.exit(0);
        }

        if(stack2.isEmpty()){
            while (!stack1.empty()) {
                ele=stack1.pop();
                stack2.push(ele);
                
            }
        }

        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        implementQueue q=new implementQueue();
//function calling for insertion in the quque
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
//function calliing for deletion of an element
       System.out.println("deleted element is :-" +q.dequeue());

    }
}
