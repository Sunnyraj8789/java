import java.util.Stack;
public class stackImple {
    public static void main(String[] args) {
        Stack<Integer>stack1=new Stack<>();
        //push in the element in the stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        System.out.println("top most element in the stack before deleting :- "+stack1.peek());
        stack1.pop();
        System.out.println("top most element in the stack after deleting:- "+stack1.peek());


        //search element 
        System.out.println("element 4 is present at the position :- "+stack1.search(4));
// search function return -1 when the element is not present in the stack
        System.out.println("element 1 is present at the position :- "+stack1.search(1));

//cheak wheather the stack empty or not 
//empty function return the boolean value(true/false)
        System.out.println("is stack is empty or not: "+stack1.empty()); 
    }
}
