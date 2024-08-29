import java.util.*;
import java.io.*;
public class lowerBoundFirst {
    public static int FindOcurrenceElement(int arr[],int target)
    {
        int low=0,high=arr.length-1;
        int result=-1;
        while (low<=high)
         {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                result=mid;
                //traversing the array
                high=mid-1;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of element");
        int n=sc.nextInt();
        System.out.println("enter the element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }



        System.out.println("enter the searching");
        int target=sc.nextInt();

        int result=FindOcurrenceElement(arr,target);
        if(result==-1)
        {
            System.out.println("not found element");
        }
        else{
            System.out.println("found element at index:- "+result);
        }
    }
}
