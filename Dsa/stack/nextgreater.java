import java.util.Stack;
import java.util.*;
import java.lang.*;

public class nextgreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int n=arr.length;
        Stack<Integer>stack1=new Stack<>();
        int nxtgreater[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stack1.isEmpty() && arr[stack1.peek()]<=arr[i]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                nxtgreater[i]=-1;
            }
            else{
                nxtgreater[i]=arr[stack1.peek()];
            }
            stack1.push(i);
        }
        for(int i=0;i<=nxtgreater.length;i++){
            System.out.print(nxtgreater[i]+ " ");
        }
    }
}
