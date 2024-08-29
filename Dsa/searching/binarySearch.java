import java.util.*;
import java.io.*;
public class binarySearch {

    public static int binarySearch(int arr[],int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        System.out.println("enter the sorted array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the searched element");
        int x=sc.nextInt();

        //calling function binary search
        int result=binarySearch(arr,x);
        if(result==0)
        {
            System.out.println("not found element");
        }
        else
        {
            System.out.println("found element at index:- "+result);
        }
    }
}