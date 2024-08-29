import java.lang.*;
import java.util.Stack;
import java.util.*;

public class LargestHistogram {
    public static void maxarea(int arr[]){
        
        int maxarea=0;
        int prev_smaller[]=new int[arr.length];
        int next_smaller[]=new int[arr.length];

        //next smaller element
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while (!st.isEmpty()&&arr[st.peek()]>=arr[i]) {
                st.pop(); 
            }
            if(st.isEmpty())
            {
                next_smaller[i]=-1;
            }
            else{
                next_smaller[i]=st.peek();
            }
            st.push(i);
        }
        

        //prev smaller element
        st=new Stack<>();
        for(int i=0;i<=arr.length-1;i++)
        {
            while (!st.isEmpty()&&arr[st.peek()]>=arr[i]) {
                st.pop(); 
            }
            if(st.isEmpty())
            {
                prev_smaller[i]=-1;
            }
            else{
                prev_smaller[i]=st.peek();
            }
            st.push(i);
        }
        //max value current area
        for(int i=0;i<=arr.length-1;i++){
            int height=arr[i];
            int width=next_smaller[i]-prev_smaller[i]-1;
            int currArea=height*width;
            maxarea=Math.max(currArea,maxarea);
        }
        System.out.println("max areaa of histogram is :- "+maxarea);
    }
    public static void main(String[] args) {

        int arr[]={4,2,1,5,6,3,2,4,2,-1};
        maxarea(arr);           
    }
}
